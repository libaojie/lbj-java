package com.lbj.ioc;

/**
 * @Classname BeanDefinition
 * @Description 基础bean类
 * @Date 2021/1/27 14:19
 * @Created by lbj
 */
public class BeanDefinition {
    private Object bean;
    public BeanDefinition(Object object){
        this.bean = object;
    }

    public Object getBean() {
        return bean;
    }
}
