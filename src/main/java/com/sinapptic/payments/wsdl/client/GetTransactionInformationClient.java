package com.sinapptic.payments.wsdl.client;

import com.sinapptic.payments.wsdl.generated.GetTransactionInformation;
import com.sinapptic.payments.wsdl.generated.GetTransactionInformationResponse;
import com.sinapptic.payments.wsdl.generated.GetTransactionInformationType;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class GetTransactionInformationClient extends WebServiceGatewaySupport {

    private final static String SOAP_ACTION = "http://www.avisortech.com/eCollectWebservices/getTransactionInformation";

    public GetTransactionInformationResponse getTransaction(final GetTransactionInformationType request) {
        final GetTransactionInformation transaction = new GetTransactionInformation();
        transaction.setRequest(request);
        return (GetTransactionInformationResponse) getWebServiceTemplate()
                .marshalSendAndReceive(transaction, new SoapActionCallback(SOAP_ACTION));
    }
}
