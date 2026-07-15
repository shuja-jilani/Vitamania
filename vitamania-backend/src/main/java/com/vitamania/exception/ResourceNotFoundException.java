package com.vitamania.exception;

import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException {

    private final ErrorCode errorCode;

    public ResourceNotFoundException(ErrorCode errorCode) {

        super(errorCode.name());

        this.errorCode = errorCode;
    }
}