import com.lbj.ioc.io.Resource;
import com.lbj.ioc.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname ResourceLoaderTest
 * @Description TODO
 * @Date 2021/1/27 18:41
 * @Created by lbj
 */
public class ResourceLoaderTest {
    @Test
    public void test() throws IOException {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("test.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
