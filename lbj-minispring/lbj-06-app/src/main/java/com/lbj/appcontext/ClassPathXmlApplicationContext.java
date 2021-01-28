package com.lbj.appcontext;

import com.lbj.bean.BeanDefinition;
import com.lbj.bean.factory.AbstractBeanFactory;
import com.lbj.bean.factory.AutowireCapableBeanFactory;
import com.lbj.bean.io.ResourceLoader;
import com.lbj.bean.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @Classname ClassPathXmlApplicationContext
 * @Description TODO
 * @Date 2021/1/28 13:50
 * @Created by lbj
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory abstractBeanFactory) throws Exception {
        super(abstractBeanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            abstractBeanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
