package com.cbu.project.dto.response;

public class ErrorResponse {

    private String message;

    public static ErrorResponse of(String message) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(message);
        return errorResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
