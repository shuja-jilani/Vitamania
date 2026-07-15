package com.vitamania.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    PRODUCT_NOT_FOUND("error.product.not.found"),
    INTERNAL_SERVER_ERROR("error.internal.server"),
    ACCESS_DENIED("error.access.denied");

    private final String messageKey;

    ErrorCode(String messageKey) {
        this.messageKey = messageKey;
    }
}