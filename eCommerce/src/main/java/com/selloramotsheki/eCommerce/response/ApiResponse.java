package com.selloramotsheki.eCommerce.response;

import com.selloramotsheki.eCommerce.Dto.ImageDto;

import java.util.List;


public class ApiResponse {
    private String message;
    private Object data;

    public ApiResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}
