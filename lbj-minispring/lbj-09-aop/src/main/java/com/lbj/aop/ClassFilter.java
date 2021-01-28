package com.lbj.aop;

/**
 * @Classname ClassFilter
 * @Description TODO
 * @Date 2021/1/28 16:46
 * @Created by lbj
 */
public interface ClassFilter {
    boolean matches(Class targetClass);

}
