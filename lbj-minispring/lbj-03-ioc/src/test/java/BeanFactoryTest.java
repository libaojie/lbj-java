import com.lbj.ioc.BeanDefinition;
import com.lbj.ioc.PropertyValue;
import com.lbj.ioc.PropertyValues;
import com.lbj.ioc.factory.AutowireCapableBeanFactory;
import com.lbj.ioc.factory.BeanFactory;
import org.junit.Test;

/**
 * @Classname BeanFactoryTest
 * @Description TODO
 * @Date 2021/1/27 14:25
 * @Created by lbj
 */
public class BeanFactoryTest {

    @Test
    public void Test() throws Exception{
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2、定义bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("HelloWorldService");

        // 3、设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("text", "hello3"));
        beanDefinition.setPropertyValues(propertyValues);

        // 4、注入
        beanFactory.registerBeanDefinition("HelloWorld", beanDefinition);

        // 5、获取Bean
        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("HelloWorld");
        helloWorldService.helloWorld();
    }


}
