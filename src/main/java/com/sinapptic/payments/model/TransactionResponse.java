package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionResponse {

    private String entityCode;

    private String ticketId;

    private String traceabilityCode;

    private TransactionState state;

    private ReturnCode returnCode;

    private TransactionValue transactionValue;

    private Bank bank;

    private PaymentMethod paymentMethod;

    private TransactionDetail detail;

}
