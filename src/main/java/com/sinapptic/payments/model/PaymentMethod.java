package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum PaymentMethod {

    PSE("0"), TC("1"), CP("100"), NOT_FOUND("NOT_FOUND");

    private String value;

    public static PaymentMethod fromValue(String value) {
        return Arrays.stream(PaymentMethod.values())
                .filter(pm -> value.equals(pm.getValue()))
                .findFirst()
                .orElse(PaymentMethod.NOT_FOUND);
    }
}
