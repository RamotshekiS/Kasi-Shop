package com.selloramotsheki.eCommerce.exeptions;

public class ProductNotFoundExecption extends RuntimeException {
    public ProductNotFoundExecption(String message) {
        super(message);
    }
}
