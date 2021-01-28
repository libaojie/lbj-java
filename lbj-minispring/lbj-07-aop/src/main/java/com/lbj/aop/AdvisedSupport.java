package com.lbj.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * @Classname AdvisedSupport
 * @Description 代理相关的元数据
 * @Date 2021/1/28 15:08
 * @Created by lbj
 */
public class AdvisedSupport {
    private TargetSource targetSource;

    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }


    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }

}
