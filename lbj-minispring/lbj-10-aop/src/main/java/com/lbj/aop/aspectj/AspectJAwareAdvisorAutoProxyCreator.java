package com.lbj.aop.aspectj;

import com.lbj.aop.*;
import com.lbj.bean.factory.AbstractBeanFactory;
import com.lbj.bean.factory.BeanFactory;
import com.lbj.bean.factory.BeanPostProcessor;
import org.aopalliance.intercept.MethodInterceptor;

import java.util.List;

/**
 * @Classname AspectJAwareAdvisorAutoProxyCreator
 * @Description TODO
 * @Date 2021/1/28 18:42
 * @Created by lbj
 */
public class AspectJAwareAdvisorAutoProxyCreator implements BeanPostProcessor, BeanFactoryAware {

    private AbstractBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws Exception {
        this.beanFactory = (AbstractBeanFactory) beanFactory;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        if (bean instanceof AspectJExpressionPointcutAdvisor){
            return bean;
        }
        if (bean instanceof MethodInterceptor){
            return bean;
        }
        List<AspectJExpressionPointcutAdvisor> advisors = beanFactory
                .getBeansForType(AspectJExpressionPointcutAdvisor.class);
        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            if (advisor.getPointcut().getClassFilter().matches(bean.getClass())) {
                AdvisedSupport advisedSupport = new AdvisedSupport();
                advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
                advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());

                TargetSource targetSource = new TargetSource(bean, bean.getClass(), bean.getClass().getInterfaces());
                advisedSupport.setTargetSource(targetSource);

                return new JdkDynamicAopProxy(advisedSupport).getProxy();
            }
        }
        return bean;
    }
}
