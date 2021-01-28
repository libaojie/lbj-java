package com.lbj.aop;

import com.lbj.bean.factory.BeanFactory;

/**
 * @Classname BeanFactoryAware
 * @Description TODO
 * @Date 2021/1/28 18:45
 * @Created by lbj
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
