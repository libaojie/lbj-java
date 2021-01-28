package com.lbj.ioc.factory;

import com.lbj.ioc.BeanDefinition;
import com.lbj.ioc.BeanReference;
import com.lbj.ioc.PropertyValue;

import java.lang.reflect.Field;

/**
 * @Classname AutowireCapableBeanFactory
 * @Description TODO
 * @Date 2021/1/27 15:11
 * @Created by lbj
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        Object object = createBeanInstance(beanDefinition);
        beanDefinition.setBean(object);
        applyPropertyValue(object, beanDefinition);
        return object;
    }


    /**
     * 实例化
     * @param beanDefinition
     * @return
     * @throws Exception
     */
    protected Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    protected void applyPropertyValue(Object bean, BeanDefinition beanDefinition) throws Exception{
        for (PropertyValue propertyValue : beanDefinition.getPropertyValueList()){
            Field field = bean.getClass().getDeclaredField(propertyValue.getName());
            field.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference){
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            field.set(bean, value);
        }
    }
}
