package com.cbu.project.exception;

import com.cbu.project.dto.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BusinessExceptionManagement {

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(AddressTitleAlreadyExistException.class)
    public ErrorResponse handleAddressTitleAlreadyExistException(AddressTitleAlreadyExistException ex) {
        return ErrorResponse.of(ex.getMessage());
    }
}
