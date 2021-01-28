package com.lbj.bean.factory;


import com.lbj.bean.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname AbstractBeanFactory
 * @Description TODO
 * @Date 2021/1/27 15:01
 * @Created by com.lbj
 */
public abstract class AbstractBeanFactory implements BeanFactory {

    // 对象字典
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    // 名称列表
    private final List<String> beanDefinitionNames = new ArrayList<>();
    // 处理器列表
    private List<BeanPostProcessor> beanPostProcessorList = new ArrayList<>();

    /**
     * 获得Bean
     * @param name
     * @return
     * @throws Exception
     */
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


    /**
     * 注册 名称
     * @param name
     * @param beanDefinition
     * @throws Exception
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
        beanDefinitionMap.put(name, beanDefinition);
        beanDefinitionNames.add(name);
    }

    /**
     * 预先生成，解决依赖
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


    /**
     * 初始化数据
     * @param bean
     * @param name
     * @throws Throwable
     */
    protected void initializeBean(Object bean, String name) throws Throwable {
        // 先执行 前处理器
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorList){
            bean = beanPostProcessor.postProcessBeforeInitialization(bean, name);
        }

        // 执行函数

        // 后执行 后处理器
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorList){
            bean = beanPostProcessor.postProcessAfterInitialization(bean, name);
        }
    }

    public void addBeanPostProcessorList(BeanPostProcessor beanPostProcessor) {
        beanPostProcessorList.add(beanPostProcessor);
    }

    public List getBeansForType(Class type) throws  Exception{
        List beans = new ArrayList();
        for (String beanDefinitionName: beanDefinitionNames){
            if (type.isAssignableFrom(beanDefinitionMap.get(beanDefinitionName).getBeanClass())){
                beans.add(getBean(beanDefinitionName));
            }
        }
        return beans;
    }
}
