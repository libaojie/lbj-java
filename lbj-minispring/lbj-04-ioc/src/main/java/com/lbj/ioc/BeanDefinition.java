package com.lbj.ioc;

/**
 * @Classname BeanDefinition
 * @Description bean的内容及元数据，保存在BeanFactory中，包装bean的实体
 * @Date 2021/1/27 14:48
 * @Created by lbj
 */
public class BeanDefinition {
    private Object bean;
    private Class beanClass;
    private String beanClassName;
    private PropertyValues propertyValues;

    public BeanDefinition() {
    }

    public Object getBean() {
        return this.bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return this.beanClass;
    }

    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public String getBeanClassName() {
        return this.beanClassName;
    }

    public PropertyValues getPropertyValues(){
        return this.propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues){
        this.propertyValues = propertyValues;
    }

}
