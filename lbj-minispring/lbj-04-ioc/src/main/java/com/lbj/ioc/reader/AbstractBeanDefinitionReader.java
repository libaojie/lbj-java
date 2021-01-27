package com.lbj.ioc.reader;

import com.lbj.ioc.BeanDefinition;
import com.lbj.ioc.io.Resource;
import com.lbj.ioc.io.ResourceLoader;

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
