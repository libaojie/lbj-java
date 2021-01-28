/**
 * @Classname HelloWorldService
 * @Description TODO
 * @Date 2021/1/28 9:47
 * @Created by lbj
 */
public class HelloWorldService {
    private String text;

    private OutputService outputService;

    public void helloWorld(){
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }

}
