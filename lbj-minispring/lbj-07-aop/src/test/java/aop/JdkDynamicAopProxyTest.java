package aop;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("text.xml");
//        HelloWorldService

    }
}
