package com.lbj.saas;

import java.io.IOException;
import java.io.OutputStream;

//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import com.aliyun.fc.runtime.Context;
//import com.aliyun.fc.runtime.HttpRequestHandler;
//
///**
// * @Description TODO
// * @Date 2021/5/31 14:46
// * @File Hello
// * @Version v1.0
// * @Date 2021/2/5 14:56
// * @Created by libaojie
// */
//public class HelloWeb implements FunctionInitializer, HttpRequestHandler {
//    private FcAppLoader fcAppLoader = new FcAppLoader();
//
//    private String ossEndPoint = "YourOSSEndPoint";
//    private String bucket = "YourOSSBucket";
//    private String key = "YourWarName";
//    private String userContextPath = "/2016-08-15/proxy/{YourServiceName}/{YourFunctionName}";
//
//    @Override
//    public void initialize(Context context) throws IOException {
//        FunctionComputeLogger fcLogger = context.getLogger();
//
//        fcAppLoader.setFCContext(context);
//
//        // Load code from OSS
//        fcAppLoader.loadCodeFromOSS(ossEndPoint, bucket, key);
//
//        // Init webapp from code
//        fcAppLoader.initApp(userContextPath, HelloWeb.class.getClassLoader());
//    }
//
//    @Override
//    public void handleRequest(HttpServletRequest request, HttpServletResponse response, Context context)
//            throws IOException, ServletException {
//        try {
//            fcAppLoader.forward(request, response);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
