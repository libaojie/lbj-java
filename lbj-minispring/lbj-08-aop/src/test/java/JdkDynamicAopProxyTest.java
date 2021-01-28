import com.lbj.aop.AdvisedSupport;
import com.lbj.aop.JdkDynamicAopProxy;
import com.lbj.aop.TargetSource;
import com.lbj.appcontext.ApplicationContext;
import com.lbj.appcontext.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Classname JdkDynamicAopProxyTest
 * @Description TODO
 * @Date 2021/1/28 15:27
 * @Created by lbj
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void test() throws Exception{

        // 1、ApplicationContent
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();

        // 2、设置被代理的对象（joinpoint）
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloWorldService, HelloWorldService.class);
        advisedSupport.setTargetSource(targetSource);

        // 3、设置拦截器（Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 4、创建代理
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWorldService helloWorldServiceProxy = (HelloWorldService) jdkDynamicAopProxy.getProxy();

        // 5、基于代理的调用
        helloWorldServiceProxy.helloWorld();



    }
}
