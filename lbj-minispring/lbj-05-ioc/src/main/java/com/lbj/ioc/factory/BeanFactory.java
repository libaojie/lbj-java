package com.lbj.ioc.factory;

import com.lbj.ioc.BeanDefinition;

/**
 * @Classname BeanFactory
 * @Description TODO
 * @Date 2021/1/27 14:56
 * @Created by lbj
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;

    void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
