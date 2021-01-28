package com.lbj.ioc;

/**
 * @Classname BeanReference
 * @Description TODO
 * @Date 2021/1/28 9:37
 * @Created by lbj
 */
public class BeanReference {


    private String name;
    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

}
