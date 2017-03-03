package com.billpay.service;

import javax.jws.WebService;

import com.telstra.payments.payment.v4.PaymentV40;
import com.telstra.payments.payment.v4.paymentrequest.FinancialRequest;
import com.telstra.payments.payment.v4.paymentresponse.FinancialResponse;
import com.telstra.payments.payment.v4.paymentresponse.Header;
import com.telstra.payments.payment.v4.paymentresponse.ResultStatus;
import com.telstra.payments.payment.v4.paymentresponse.TransactionResults;

@WebService(serviceName = "PaymentService")
public class PaymentServiceImpl implements PaymentV40{

	@Override
	public FinancialResponse processPayment(FinancialRequest request) {
		// TODO Auto-generated method stub
		System.out.println("Received request for processPayment" + request.getHeader().getUser());
		FinancialResponse response = new FinancialResponse();
		Header header = new Header();
		header.setServiceDomain(request.getHeader().getServiceDomain());
		header.setServiceClass(request.getHeader().getServiceClass());
		header.setServiceId(request.getHeader().getServiceId());
		header.setOrganisationId(request.getHeader().getOrganisationId());
		header.setSystemId(request.getHeader().getSystemId());
		header.setSubsystemId(request.getHeader().getSubsystemId());
		header.setUser(request.getHeader().getUser());
		header.setUserType(request.getHeader().getUserType());
		header.setCrn(request.getHeader().getCrn());
		header.setVersion(request.getHeader().getVersion());
		header.setTimestamp(null);
		response.setHeader(header);
		
		ResultStatus status = new ResultStatus();
		status.setTranStatus(0);
		status.setResponseCode("0000");
		status.setResponseText("Successful");
		response.setResultStatus(status);
		
		TransactionResults transResult = new TransactionResults();
		transResult.setBrn("0000145854");
		transResult.setSettlementDate("00010101");
		transResult.setTranslatedPan("9499705830000850");
		response.setTranResults(transResult);
		
		return response;
	}

}
