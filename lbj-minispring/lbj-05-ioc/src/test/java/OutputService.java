import org.junit.Assert;

/**
 * @Classname OutputService
 * @Description TODO
 * @Date 2021/1/28 9:47
 * @Created by lbj
 */
public class OutputService {
    private HelloWorldService helloWorldService;

    public void output(String text){
        Assert.assertNotNull(helloWorldService);
        System.out.println(text);
    }

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
}
