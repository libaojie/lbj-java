package com.lbj.appcontext;

import com.lbj.bean.factory.AbstractBeanFactory;

/**
 * @Classname AbstractApplicationContext
 * @Description TODO
 * @Date 2021/1/28 12:44
 * @Created by com.lbj
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory abstractBeanFactory;

    public AbstractApplicationContext(AbstractBeanFactory abstractBeanFactory) {
        this.abstractBeanFactory = abstractBeanFactory;
    }

    public abstract void refresh() throws Exception;

    @Override
    public Object getBean(String name) throws Exception {
        return abstractBeanFactory.getBean(name);
    }
}
