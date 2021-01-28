package com.lbj.bean.factory;

/**
 * @Classname BeanFactory
 * @Description TODO
 * @Date 2021/1/27 14:56
 * @Created by com.lbj
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;

//    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
