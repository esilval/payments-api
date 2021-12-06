package com.sinapptic.payments.converter;

import com.sinapptic.payments.model.*;
import com.sinapptic.payments.wsdl.generated.*;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

@Component
public class PaymentConverter {

    public static final String BASE_DATE_FORMAT = "yyyyMMdd";
    public static final String NORMAL_DATE_FORMAT = "yyyy-MM-dd";
    private static final String ENTITY_CODE = "10007";
    private static final String CURRENCY = "COP";

    public CreateTransactionType convertCreateTransactionType(final PaymentRequest request) {
        final CreateTransactionType type = new CreateTransactionType();
        type.setEntityCode(ENTITY_CODE);
        type.setSrvCode(request.getServiceCode());
        type.setSrvCurrency(CURRENCY);
        type.setTransValue(request.getAmount());
        type.setTransVatValue(BigDecimal.ZERO);
        type.setURLRedirect(request.getUrlRedirect());
        type.getReferenceArray().addAll(convertReferences(request.getDetail()));

        return type;
    }

    public PaymentResponse convertPaymentResponse(final CreateTransactionPaymentResponse response) {
        final CreateTransactionResponseType result = response.getCreateTransactionPaymentResult();
        return PaymentResponse.builder()
                .returnCode(ReturnCode.valueOf(result.getReturnCode()))
                .ticketId(result.getTicketId())
                .ecollectUrl(result.getECollectUrl())
                .build();
    }

    public GetTransactionInformationType convertGetTransactionInformationType(final String ticketId) {
        GetTransactionInformationType type = new GetTransactionInformationType();
        type.setEntityCode(ENTITY_CODE);
        type.setTicketId(ticketId);
        return type;
    }

    public TransactionResponse convertTransactionResponse(final GetTransactionInformationResponse response) {
        final GetTransactionInformationResponseType result = response.getGetTransactionInformationResult();
        return TransactionResponse.builder()
                .entityCode(result.getEntityCode())
                .ticketId(result.getTicketId())
                .traceabilityCode(result.getTrazabilityCode())
                .state(TransactionState.fromValue(result.getTranState()))
                .transactionValue(convertTransactionValue(result))
                .bank(convertBank(result))
                .returnCode(ReturnCode.valueOf(result.getReturnCode()))
                .paymentMethod(PaymentMethod.fromValue(result.getPaymentSystem()))
                .detail(convertTransactionDetail(result.getReferenceArray()))
                .build();
    }

    private Bank convertBank(GetTransactionInformationResponseType result) {
        return Bank.builder()
                .name(result.getBankName())
                .processDate(convertStringToLocalDate(result.getBankProcessDate().toString(), NORMAL_DATE_FORMAT))
                .build();
    }

    private TransactionValue convertTransactionValue(GetTransactionInformationResponseType result) {
        return TransactionValue.builder()
                .amount(result.getTransValue())
                .taxes(result.getTransVatValue())
                .currency(result.getPayCurrency())
                .currencyRate(result.getCurrencyRate())
                .build();
    }

    private List<String> convertReferences(TransactionDetail detail) {
        final List<String> references = new ArrayList<>();

        references.add(detail.getDocumentType().getCode());
        references.add(detail.getDocumentNumber());
        references.add(detail.getFullName());
        references.add(detail.getEmail());
        references.add(detail.getAddress());
        references.add(detail.getPhoneNumber());
        references.add(detail.getCity());
        references.add(detail.getCountry());
        references.add(detail.getMaterialCode());
        references.add(detail.getBenefitCenter());
        references.add(detail.getFacultyCode());
        references.add(detail.getClped());
        references.add(nonNull(detail.getStartDate()) ? convertLocalDateToString(detail.getStartDate()) : "0");
        references.add(nonNull(detail.getEndDate()) ? convertLocalDateToString(detail.getEndDate()) : "0");
        references.add(detail.getPinalu());
        references.add(detail.getOrderNumber());
        return references;
    }

    private TransactionDetail convertTransactionDetail(List<String> references) {
        if (references.isEmpty()) {
            return null;
        }

        return TransactionDetail.builder()
                .documentType(DocumentType.fromValues(references.get(0)))
                .documentNumber(references.get(1))
                .fullName(references.get(2))
                .email(references.get(3))
                .address(references.get(4))
                .phoneNumber(references.get(5))
                .city(references.get(6))
                .country(references.get(7))
                .materialCode(references.get(8))
                .benefitCenter(references.get(9))
                .facultyCode(references.get(10))
                .clped(references.get(11))
                .startDate("0".equals(references.get(12)) ? null : convertStringToLocalDate(references.get(12), BASE_DATE_FORMAT))
                .endDate("0".equals(references.get(13)) ? null : convertStringToLocalDate(references.get(13), BASE_DATE_FORMAT))
                .pinalu(references.get(14))
                .orderNumber(references.get(15))
                .build();
    }

    private String convertLocalDateToString(final LocalDate localDate) {
        return localDate.format(getFormatter(PaymentConverter.BASE_DATE_FORMAT));
    }

    private LocalDate convertStringToLocalDate(final String str, final String format) {
        return LocalDate.parse(str, getFormatter(format));
    }

    private DateTimeFormatter getFormatter(final String pattern) {
        return DateTimeFormatter.ofPattern(pattern);
    }
}
