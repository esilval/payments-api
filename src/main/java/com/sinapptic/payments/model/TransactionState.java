package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum TransactionState {

    OK("OK"),
    NOT_AUTHORIZED("NOT_AUTHORIZED"),
    EXPIRED("EXPIRED"),
    BANK("BANK"),
    PENDING("PENDING"),
    FAILED("FAILED"),
    CREATED("CREATED"),
    CAPTURED("CAPTURED"),
    NOT_FOUND("NOT_FOUND");

    private String value;

    public static TransactionState fromValue(final String value) {
        return Arrays.stream(TransactionState.values())
                .filter(tx -> value.equals(tx.getValue()))
                .findFirst()
                .orElse(NOT_FOUND);
    }
}
