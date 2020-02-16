package com.example.client_book.driver.util;

import com.example.client_book.driver.model.enums.ErrorLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class ApiValidationError {

    private String message;
    private ErrorLevel errorLevel;

    public ApiValidationError() {

    }
}
