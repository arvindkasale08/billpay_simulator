package com.billpay.service;

import java.util.Map;
import java.util.Map.Entry;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.causecode.models.Card;
import com.causecode.services.impl.CardService;
import com.causecode.utils.CardUtils;
import com.telstra.payments.gimmi.enquiry.Enquiry;
import com.telstra.payments.gimmi.enquiry.enquiryrequest.EnqRequest;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.EnqResponse;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.GimmiResult;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.Header;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.PANDetails;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.ResultStatus;
import com.telstra.payments.gimmi.enquiry.enquiryresponse.TransactionResults;

@WebService(serviceName="EnquiryService")
public class EnquiryServiceImpl implements Enquiry{
	@Autowired
	CardService service;

	@Override
	public EnqResponse processEnquiry(EnqRequest request) {
		System.out.println("Received request for processEnquiry" + request.getHeader().getUser());
		Card card = getCard(request);
		// TODO Auto-generated method stub
		EnqResponse response = new EnqResponse();
		Header header = new Header();
		header.setServiceDomain("MerchantPayment");
		header.setServiceClass("GIMMI External");
		header.setServiceId("Enquiry");
		header.setOrganisationId("Telstra");
		header.setSystemId("AppsMarketplace");
		header.setSubSystemId("Online");
		header.setUser(request.getHeader().getUser());
		header.setUserType("MP-Customer");
		header.setCrn(request.getHeader().getCrn());
		header.setVersion("1.0");
		header.setTimestamp(null);
		response.setHeader(header);
		
		GimmiResult result = new GimmiResult();
		result.setReasonCode(card == null ? "0008" : "0000");
		result.setReasonText(card == null ? "Failure" : "Success");
		result.setResultState("COMPLETE");
		response.setGimmiResult(result);
		
		ResultStatus status = new ResultStatus();
		status.setTranStatus(0);
		status.setResponseCode(card == null ? "0008" : "0000");
		status.setResponseText(card == null ? "Failure" : "Successful");
		response.setResultStatus(status);
		
		TransactionResults transResult = new TransactionResults();
		transResult.setBrn("0000145854");
		transResult.setSettlementDate("00010101");
		transResult.setTranslatedPan("9499705830000850");
		response.setTranResults(transResult);

		PANDetails details = new PANDetails();
		if( card != null) {
			details.setCardNo(CardUtils.maskCardNumber(card.getNumber(), "xxxx-xxxx-xxxx-####"));
			details.setExpiryMonth("01");
			details.setExpiryYear("2021");
			details.setNameOnCard(card.getName());
		}	
		response.setPanDetails(card == null ? null : details);
		
		return response;
	}

	private Card getCard(EnqRequest request) {
		Map<String, Card> map = service.getMap();
		Card card = null;
		for(Entry<String, Card> entry : map.entrySet()) {
			if(entry.getKey().contains(request.getEnquirySegment().getConsumerReferenceID())) {
				return entry.getValue();
			}
		}
		return card;
	}

}
