package com.lbj.bean.reader;

import com.lbj.bean.BeanDefinition;
import com.lbj.bean.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname AbstractBeanDefinitionReader
 * @Description 从配置中读取BeanDefinitionReader
 * @Date 2021/1/27 16:32
 * @Created by lbj
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private Map<String, BeanDefinition> registry;
    private ResourceLoader resourceLoader;

    protected  AbstractBeanDefinitionReader(ResourceLoader resourceLoader){
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry(){return registry;}
    public ResourceLoader getResourceLoader(){
        return resourceLoader;
    }
}
