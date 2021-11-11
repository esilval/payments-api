package com.sinapptic.payments.wsdl.client;

import com.sinapptic.payments.wsdl.generated.CreateTransactionPayment;
import com.sinapptic.payments.wsdl.generated.CreateTransactionPaymentResponse;
import com.sinapptic.payments.wsdl.generated.CreateTransactionType;
import lombok.extern.java.Log;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Log
public class CreateTransactionClient extends WebServiceGatewaySupport {

    private final static String SOAP_ACTION = "http://www.avisortech.com/eCollectWebservices/createTransactionPayment";

    public CreateTransactionPaymentResponse createTransaction(final CreateTransactionType request) {
        final CreateTransactionPayment createTransactionPayment = new CreateTransactionPayment();
        createTransactionPayment.setRequest(request);

        return (CreateTransactionPaymentResponse) getWebServiceTemplate()
                .marshalSendAndReceive(createTransactionPayment, new SoapActionCallback(SOAP_ACTION));
    }
}
