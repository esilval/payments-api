package com.sinapptic.payments.controller;

import com.sinapptic.payments.model.PaymentRequest;
import com.sinapptic.payments.model.PaymentResponse;
import com.sinapptic.payments.model.TransactionResponse;
import com.sinapptic.payments.service.PaymentTransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PaymentController implements IPaymentController {

    private final PaymentTransactionService service;

    @Override
    public ResponseEntity<TransactionResponse> getTransaction(String ticketId) {
        return ResponseEntity.ok(service.getTransaction(ticketId));
    }

    @Override
    public ResponseEntity<PaymentResponse> createPaymentTransaction(PaymentRequest request) {
        return ResponseEntity.ok(service.createPayment(request));
    }
}
