package com.lbj.aop.aspectj;

import com.lbj.bean.factory.BeanFactory;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @Classname AspectJAroundAdvice
 * @Description TODO
 * @Date 2021/1/28 18:20
 * @Created by lbj
 */
public class AspectJAroundAdvice implements Advice, MethodInterceptor {

    private BeanFactory beanFactory;
    private Method aspectJAdviceMethod;
    private String aspectInstanceName;

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return aspectJAdviceMethod.invoke(beanFactory.getBean(aspectInstanceName), methodInvocation);
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Method getAspectJAdviceMethod() {
        return aspectJAdviceMethod;
    }

    public void setAspectJAdviceMethod(Method aspectJAdviceMethod) {
        this.aspectJAdviceMethod = aspectJAdviceMethod;
    }

    public String getAspectInstanceName() {
        return aspectInstanceName;
    }

    public void setAspectInstanceName(String aspectInstanceName) {
        this.aspectInstanceName = aspectInstanceName;
    }
}
