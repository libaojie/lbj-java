package com.lbj.saas;

import com.lbj.saas.model.SimpleRequest;
import com.lbj.saas.model.SimpleResponse;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.PojoRequestHandler;

/**
 * @Description TODO
 * @Date 2021/5/31 14:38
 * @File HelloFCPojo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class HelloFCPojo implements PojoRequestHandler<SimpleRequest, SimpleResponse> {

    @Override
    public SimpleResponse handleRequest(SimpleRequest request, Context context) {
        String message = "Hello, " + request.getFirstName() + " " + request.getLastName();
        return new SimpleResponse(message);
    }
}
