package com.lbj.aop;

/**
 * @Classname Pointcut
 * @Description TODO
 * @Date 2021/1/28 16:46
 * @Created by lbj
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
