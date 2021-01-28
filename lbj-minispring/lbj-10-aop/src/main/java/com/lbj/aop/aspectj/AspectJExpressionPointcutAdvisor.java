package com.lbj.aop.aspectj;

import com.lbj.aop.Pointcut;
import com.lbj.aop.advisor.PointcutAdvisor;
import com.lbj.aop.aspectj.AspectJExpressionPointcut;
import org.aopalliance.aop.Advice;

/**
 * @Classname AspectJExpressionPointcutAdvisor
 * @Description TODO
 * @Date 2021/1/28 16:45
 * @Created by lbj
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {
    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();

    private Advice advice;

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    public void setExpression(String expression) {
        this.pointcut.setExpression(expression);
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }
}
