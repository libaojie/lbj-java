package com.lbj.ioc.reader;

/**
 * @Classname BeanDefinitionReader
 * @Description 从配置中读取BeanDefinitionReader
 * @Date 2021/1/27 16:30
 * @Created by lbj
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
