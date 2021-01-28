import com.lbj.appcontext.ApplicationContext;
import com.lbj.appcontext.ClassPathXmlApplicationContext;
import org.junit.Test;

/**
 * @Classname AppcontextTest
 * @Description TODO
 * @Date 2021/1/28 13:57
 * @Created by lbj
 */
public class AppcontextTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test.xml");
        HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
        helloWorldService.helloWorld();

    }
}
