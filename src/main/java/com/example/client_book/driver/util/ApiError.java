package com.example.client_book.driver.util;

import com.example.client_book.driver.model.Inscription;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.List;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApiError extends RuntimeException {

    private List<ApiValidationError> apiValidationErrorList = new ArrayList<ApiValidationError>();

    public ApiError(String message, Exception e) {
        super(message, e);
        ApiValidationError newError = new ApiValidationError();
        newError.setMessage(e.getMessage());
        apiValidationErrorList.add(newError);
    }
}
