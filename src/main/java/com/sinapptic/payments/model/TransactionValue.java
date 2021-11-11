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
public class TransactionValue {

    private BigDecimal amount;

    private BigDecimal taxes;

    private String currency;

    private BigDecimal currencyRate;

}
