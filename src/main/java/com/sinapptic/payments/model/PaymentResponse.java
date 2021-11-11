package com.sinapptic.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentResponse {

    private ReturnCode returnCode;

    private String ticketId;

    private String ecollectUrl;

}
