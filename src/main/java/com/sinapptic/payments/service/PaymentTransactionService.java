package com.sinapptic.payments.service;

import com.sinapptic.payments.converter.PaymentConverter;
import com.sinapptic.payments.model.PaymentRequest;
import com.sinapptic.payments.model.PaymentResponse;
import com.sinapptic.payments.model.TransactionResponse;
import com.sinapptic.payments.wsdl.client.CreateTransactionClient;
import com.sinapptic.payments.wsdl.client.GetTransactionInformationClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentTransactionService {

    private final PaymentConverter converter;

    private final CreateTransactionClient createTransactionClient;

    private final GetTransactionInformationClient getTransactionInformationClient;

    public PaymentResponse createPayment(PaymentRequest request) {
        return converter.convertPaymentResponse(createTransactionClient.createTransaction(
                converter.convertCreateTransactionType(request)));
    }

    public TransactionResponse getTransaction(final String ticketId) {
        return converter.convertTransactionResponse(getTransactionInformationClient.getTransaction(
                converter.convertGetTransactionInformationType(ticketId)));
    }
}
