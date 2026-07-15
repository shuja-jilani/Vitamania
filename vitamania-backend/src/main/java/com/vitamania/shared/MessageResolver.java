package com.vitamania.shared;

import com.vitamania.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@RequiredArgsConstructor
public class MessageResolver {

    private final MessageSource messageSource;

    public String getMessage(ErrorCode errorCode) {

        return messageSource.getMessage(
                errorCode.getMessageKey(),
                null,
                Locale.ENGLISH
        );
    }
}