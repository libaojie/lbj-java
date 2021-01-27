package com.lbj.ioc;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname BeanFactory
 * @Description bean 工厂
 * @Date 2021/1/27 14:21
 * @Created by lbj
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String beanName) {
        return this.beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }
}
