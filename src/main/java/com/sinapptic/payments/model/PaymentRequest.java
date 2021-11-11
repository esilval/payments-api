package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentRequest {

    private BigDecimal amount;

    private String urlRedirect;

    private String serviceCode;

    private TransactionDetail detail;

}
