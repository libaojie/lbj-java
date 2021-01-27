import com.lbj.ioc.BeanDefinition;
import com.lbj.ioc.factory.AutowireCapableBeanFactory;
import com.lbj.ioc.factory.BeanFactory;
import com.lbj.ioc.io.ResourceLoader;
import com.lbj.ioc.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @Classname BeanFactoryTest
 * @Description TODO
 * @Date 2021/1/27 18:44
 * @Created by lbj
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception{
        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("test.xml");

        // 2.初始化BeanFactory并注册bean
        BeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

//        // 3.获取bean
//        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
//        helloWorldService.helloWorld();
    }
}
