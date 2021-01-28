import com.lbj.aop.AspectJExpressionPointcut;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Classname AspectJExpressionPointcutTest
 * @Description TODO
 * @Date 2021/1/28 17:40
 * @Created by lbj
 */
public class AspectJExpressionPointcutTest {
    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* *.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* *.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloWorldServiceImpl.class.getDeclaredMethod("helloWorld"),HelloWorldServiceImpl.class);
        Assert.assertTrue(matches);
    }
}
