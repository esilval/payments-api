package com.sinapptic.payments.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransactionDetail {

    private DocumentType documentType;

    private String documentNumber;

    private String fullName;

    private String email;

    private String address;

    private String phoneNumber;

    private String country;

    private String materialCode;

    private String settlementNumber;

    private String benefitCenter;

    private String facultyCode;

    private String clped;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    private String pinalu;

    private String city;

}
