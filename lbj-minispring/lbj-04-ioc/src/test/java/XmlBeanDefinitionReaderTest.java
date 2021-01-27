import com.lbj.ioc.BeanDefinition;
import com.lbj.ioc.io.ResourceLoader;
import com.lbj.ioc.xml.XmlBeanDefinitionReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * @Classname XmlBeanDefinitionReaderTest
 * @Description TODO
 * @Date 2021/1/27 18:42
 * @Created by lbj
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("test.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }
}
