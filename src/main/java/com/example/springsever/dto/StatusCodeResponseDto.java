package com.example.springsever.dto;

@Getter
public class StatusCodeResponseDto {
    private String message;
    private int statusCode;

    public StatusCodeResponseDto(int statusCode, String message) {
        this.message = message;
        this.statusCode = statusCode;
    }

}