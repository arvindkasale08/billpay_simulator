package com.billpay.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

import javax.jws.WebService;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;

import com.causecode.models.Card;
import com.causecode.services.impl.CardService;
import com.telstra.payments.gimmi.setup.SetUp;
import com.telstra.payments.gimmi.setup.setuprequest.GimmiConsumerSegment;
import com.telstra.payments.gimmi.setup.setuprequest.SetUpReq;
import com.telstra.payments.gimmi.setup.setupresponse.GimmiResult;
import com.telstra.payments.gimmi.setup.setupresponse.GimmiSegment;
import com.telstra.payments.gimmi.setup.setupresponse.Header;
import com.telstra.payments.gimmi.setup.setupresponse.SetUpRes;

@WebService(serviceName="SetupService")
public class SetupServiceImpl implements SetUp{
	
	private final String returnUrl = "http://localhost:5050/store-locator/card/redirect";

	@Autowired
	CardService service;
	
	@Override
	public SetUpRes processSetUp(SetUpReq request) {
		String uuid = UUID.randomUUID().toString();
		populateMap(request, uuid);
		// TODO Auto-generated method stub
		System.out.println("Received request for processSetup" + request.getHeader().getUser());
		SetUpRes response = new SetUpRes();
		Header header = new Header();
		header.setServiceDomain("MerchantPayment");
		header.setServiceClass("GIMMI External");
		header.setServiceId("Setup");
		header.setOrganisationId("Telstra");
		header.setSystemId("AppsMarketplace");
		header.setSubSystemId("Online");
		header.setUser("4162");
		header.setUserType("MP-Customer");
		header.setCrn(request.getHeader().getCrn());
		header.setVersion("1.0");
		header.setTimestamp(null);
		response.setHeader(header);
		
		GimmiResult result = new GimmiResult();
		result.setResultState("SETUP");
		result.setReasonCode("0000");
		result.setReasonText("Success");
		response.setGimmiResult(result);
		
		GimmiSegment segment = new GimmiSegment();
		//segment.setBillPayRedirectURL(returnUrl+uuid+"&url="+request.getGimmiConsumerSegment().getConsumerReturnURL());
		segment.setBillPayRedirectURL(returnUrl);
		segment.setBillPayTokenID(uuid);
		response.setGimmiSegment(segment);
		
		return response;
	}

	private void populateMap(SetUpReq request, String uuid) {
		// TODO Auto-generated method stub
		Map<String, Card> map = service.getMap();
		String key = request.getFiMetaData().getFinInstrumentReference() + "~" + uuid + "~" + request.getGimmiConsumerSegment().getConsumerReturnURL();
		map.put(key, null);
	}

}
