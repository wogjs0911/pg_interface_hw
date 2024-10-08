package com.wanted.clone.oneport.payments.application.service;

import com.wanted.clone.oneport.payments.representation.port.in.PaymentRequestUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
@RequiredArgsConstructor
public class PaymentRequestService implements PaymentRequestUseCase {
    @Override
    public String renderPgUi() {
        return "toss/checkout";
    }
}
