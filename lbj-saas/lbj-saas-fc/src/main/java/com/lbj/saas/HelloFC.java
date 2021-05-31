package com.lbj.saas;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Date 2021/5/31 14:03
 * @File HelloFC
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class HelloFC implements StreamRequestHandler {

    /**
     * 初级
     *
     * @param inputStream
     * @param outputStream
     * @param context
     * @throws IOException
     */
    @Override
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write(new String("hello world").getBytes());
    }

//    @Override
//    public void handleRequest(
//            InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
//
//        String endpoint = "oss-cn-shanghai.aliyuncs.com";
//        String bucketName = "my-bucket";
//
//        Credentials creds = context.getExecutionCredentials();
//        OSSClient client = new OSSClient(
//                endpoint, creds.getAccessKeyId(), creds.getAccessKeySecret(), creds.getSecurityToken());
//        client.putObject(bucketName, "my-object", new ByteArrayInputStream(new String("hello").getBytes()));
//        outputStream.write(new String("done").getBytes());
//    }

}