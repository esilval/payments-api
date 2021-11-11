package com.sinapptic.payments.controller;

import com.sinapptic.payments.model.PaymentRequest;
import com.sinapptic.payments.model.PaymentResponse;
import com.sinapptic.payments.model.TransactionResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IPaymentController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<TransactionResponse> getTransaction(@RequestParam(value = "ticket-id") String ticketId);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PaymentResponse> createPaymentTransaction(@RequestBody PaymentRequest request);
}
