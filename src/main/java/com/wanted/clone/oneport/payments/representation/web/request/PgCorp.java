package com.wanted.clone.oneport.payments.representation.web.request;

import lombok.Getter;

@Getter
public enum PgCorp {
    TOSS(1),
    NHN_KCP(2);

    private int code;

    private PgCorp(int code) {
        this.code = code;
    }

}
