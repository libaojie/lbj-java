package com.lbj.aop;

/**
 * @Classname TargetSource
 * @Description 被代理的对象
 * @Date 2021/1/28 14:59
 * @Created by lbj
 */
public class TargetSource {
    private Class targetClass;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }

    public Class getTargetClass() {
        return targetClass;

    }

    public Object getTarget() {
        return target;
    }

}
