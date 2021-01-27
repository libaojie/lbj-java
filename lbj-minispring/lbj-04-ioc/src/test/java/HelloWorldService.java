/**
 * @Classname HelloWorldService
 * @Description TODO
 * @Date 2021/1/27 14:25
 * @Created by lbj
 */
public class HelloWorldService {
    private String text;

    public void helloWorld() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}

