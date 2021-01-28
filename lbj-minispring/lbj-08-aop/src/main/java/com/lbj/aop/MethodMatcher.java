package com.lbj.aop;

import java.lang.reflect.Method;

/**
 * @Classname MethodMatcher
 * @Description TODO
 * @Date 2021/1/28 16:46
 * @Created by lbj
 */
public interface MethodMatcher {
    boolean matches(Method method, Class targetClass);
}
