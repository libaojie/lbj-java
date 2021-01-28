package com.lbj.bean.factory;

/**
 * @Classname BeanPostProcessor
 * @Description TODO
 * @Date 2021/1/28 17:05
 * @Created by lbj
 */
public interface BeanPostProcessor {

    /**
     * 之前
     * @param bean
     * @param beanName
     * @return
     * @throws Exception
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    /**
     * 之后
     * @param bean
     * @param beanName
     * @return
     * @throws Exception
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
