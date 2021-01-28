/**
 * @Classname HelloWorldServiceImpl
 * @Description TODO
 * @Date 2021/1/28 15:29
 * @Created by lbj
 */
public class HelloWorldServiceImpl implements HelloWorldService {
    private String text;
    private OutputService outputService;

    @Override
    public void helloWorld() {
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
