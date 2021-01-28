import com.lbj.bean.factory.BeanPostProcessor;

/**
 * @Classname BeanInitializeLogger
 * @Description TODO
 * @Date 2021/1/28 17:31
 * @Created by lbj
 */
public class BeanInitializeLogger implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " start!");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " end!");
        return bean;
    }
}
