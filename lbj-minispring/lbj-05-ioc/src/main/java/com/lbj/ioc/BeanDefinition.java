package com.lbj.ioc;

/**
 * @Classname BeanDefinition
 * @Description bean的内容及元数据，保存在BeanFactory中，包装bean的实体
 * @Date 2021/1/27 14:48
 * @Created by lbj
 */
public class BeanDefinition {
    // 具体对象
    private Object bean;
    // 对象类型
    private Class beanClass;
    // 对象类型名称
    private String beanClassName;
    // 对象属性列表
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

    public void setPropertyValue(PropertyValue propertyValue){
        if (this.propertyValues == null){
            this.propertyValues = new PropertyValues();
        }
        propertyValues.addPropertyValue(propertyValue);
    }

}
