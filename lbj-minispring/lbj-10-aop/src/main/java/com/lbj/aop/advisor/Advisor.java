package com.lbj.aop.advisor;

import org.aopalliance.aop.Advice;

/**
 * @Classname Advisor
 * @Description TODO
 * @Date 2021/1/28 16:41
 * @Created by lbj
 */
public interface Advisor {
    Advice getAdvice();
}
