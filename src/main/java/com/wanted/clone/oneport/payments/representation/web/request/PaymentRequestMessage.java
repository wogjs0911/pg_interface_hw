package com.wanted.clone.oneport.payments.representation.web.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class PaymentRequestMessage {
    private String siteCode;
    private String userId;
    private String productName;
    private int productQuantity;
    private int totalAmount;
    private int pgCorpCode;
}
