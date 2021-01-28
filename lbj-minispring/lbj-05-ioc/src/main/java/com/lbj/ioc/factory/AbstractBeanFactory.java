package com.lbj.ioc.factory;

import com.lbj.ioc.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname AbstractBeanFactory
 * @Description TODO
 * @Date 2021/1/27 15:01
 * @Created by lbj
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    private final List<String> beanDefinitionNames = new ArrayList<>();

    @Override
    public Object getBean(String name) throws Exception {

        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (beanDefinition == null) {
            throw new IllegalArgumentException("No find bean ");
        }

        Object bean = beanDefinition.getBean();
        if (bean == null) {
            bean = doCreateBean(beanDefinition);
        }
        return bean;
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
//        Object bean = this.doCreateBean(beanDefinition);
//        beanDefinition.setBean(bean);
//        beanDefinitionMap.put(name, beanDefinition);
        beanDefinitionMap.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }

    /**
     * 预先生成
     *
     * @throws Exception
     */
    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext(); ) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }

    /**
     * 初始化Bean
     *
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
