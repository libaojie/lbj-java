import com.lbj.ioc.BeanDefinition;
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
    public void Test() {
        // 1.初始化BeanFactory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2、注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("HelloWorldService");
        beanFactory.registerBeanDefinition("HelloWorld", beanDefinition);

        // 3、获取Bean
        HelloWorldService helloWorldService = (HelloWorldService)beanFactory.getBean("HelloWorld");
        helloWorldService.helloWorld();
    }


}
