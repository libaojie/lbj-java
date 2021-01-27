package com.lbj.ioc.factory;

import com.lbj.ioc.BeanDefinition;

/**
 * @Classname AutowireCapableBeanFactory
 * @Description TODO
 * @Date 2021/1/27 15:11
 * @Created by lbj
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        Object object = null;
        try {
            object = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return object;
    }
}
