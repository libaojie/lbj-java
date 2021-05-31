package com.lbj.saas.model;

/**
 * @Description TODO
 * @Date 2021/5/31 14:26
 * @File SimpleResponse
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class SimpleResponse {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SimpleResponse() {}
    public SimpleResponse(String message) {
        this.message = message;
    }
}
