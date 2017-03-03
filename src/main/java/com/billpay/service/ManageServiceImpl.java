package com.billpay.service;

import java.util.Map;
import java.util.Map.Entry;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.causecode.models.Card;
import com.causecode.services.impl.CardService;
import com.causecode.utils.CardUtils;
import com.telstra.payments.gimmi.enquiry.enquiryrequest.EnqRequest;
import com.telstra.payments.manage.v1.Manage;
import com.telstra.payments.manage.v1.managerequest.ManageReq;
import com.telstra.payments.manage.v1.manageresponse.Header;
import com.telstra.payments.manage.v1.manageresponse.ManageRes;
import com.telstra.payments.manage.v1.manageresponse.PaymentInstrumentList;
import com.telstra.payments.manage.v1.manageresponse.PaymentInstrumentsResults;
import com.telstra.payments.manage.v1.manageresponse.ResultStatus;

@WebService(serviceName="ManageService")
public class ManageServiceImpl implements Manage{
	
	@Autowired
	CardService service;

	@Override
	public ManageRes processManage(ManageReq request) {
		System.out.println("Received request for processManage" + request.getHeader().getUser());
		Card card = getCard(request);
		// TODO Auto-generated method stub
		ManageRes response = new ManageRes();
		Header header = new Header();
		header.setServiceDomain("Administration");
		header.setServiceClass("ManageProfile");
		header.setServiceId("RetrievePI");
		header.setOrganisationId("Telstra");
		header.setSystemId("AppsMarketplace");
		header.setSubSystemId("Online");
		header.setUser(request.getHeader().getUser());
		header.setUserType(request.getHeader().getUserType());
		header.setCrn(request.getHeader().getCrn());
		header.setVersion("1.0");
		header.setTimestamp(null);
		response.setHeader(header);
		
		ResultStatus status = new ResultStatus();
		status.setTranStatus(0);
		status.setResponseCode(card == null ? "0008" :"0000");
		status.setResponseText(card == null ? "Profile Doesnt exist" : "Successful");
		response.setResultStatus(status);

		PaymentInstrumentsResults result = new PaymentInstrumentsResults();
		if(card != null) {
			result.setCount("0001");
			PaymentInstrumentList list = new PaymentInstrumentList();
			list.setFinInstrumentInstance("00");
			list.setFinInstrumentType("Credit Card");
			list.setPaymentInstrumentStatus("ACTIVE");
			list.setMaskedCardNumber(CardUtils.maskCardNumber(card.getNumber(), "xxxx-xxxx-xxxx-####"));
			list.setExpiryMonth("01");
			list.setExpiryYear("2021");
			list.setAccountHolderFirstName(card.getName());
			list.setAccountHolderLastName(card.getName());
			result.getPaymentInstrumentList().add(list);
		}
		response.setPaymentInstrumentsResults(result);
		return response;
	}
	
	private Card getCard(ManageReq request) {
		Map<String, Card> map = service.getMap();
		Card card = null;
		for(Entry<String, Card> entry : map.entrySet()) {
			if(entry.getKey().contains(request.getRequestData().getFinInstrumentReference())) {
				return entry.getValue();
			}
		}
		return card;
	}

}
