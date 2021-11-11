package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum DocumentType {

    RC("11"), TI("16"), CC("13"), TE("21"), CE("22"), PP("41");

    private String code;

    public static DocumentType fromValues(final String value) {
        return Stream.of(DocumentType.values())
                .filter(dt -> value.equals(dt.getCode()))
                .findFirst()
                .orElse(CC);
    }
}
