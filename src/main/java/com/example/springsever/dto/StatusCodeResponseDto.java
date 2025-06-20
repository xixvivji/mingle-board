package com.example.springsever.dto;

import lombok.Getter;

@Getter
public class StatusCodeResponseDto {
    private String message;
    private int statusCode;

    public StatusCodeResponseDto(int statusCode, String message) {
        this.message = message;
        this.statusCode = statusCode;
    }

    //StausCodeResponseDto.builder()
    //     .statusCode(statusCode)
    //     .message("로그인 성공")
    //     .build();
    //단, Builder는 필요할 때만 쓰는 걸 권장(간단한 클래스에는 불필요할 수도 있음).
}