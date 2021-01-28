package com.lbj.aop.advisor;

import com.lbj.aop.Pointcut;

/**
 * @Classname PointcutAdvisor
 * @Description TODO
 * @Date 2021/1/28 16:47
 * @Created by lbj
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
