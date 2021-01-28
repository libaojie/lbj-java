package com.lbj.aop.aopproxy;

import com.lbj.aop.AdvisedSupport;

/**
 * @Classname AbstractAopProxy
 * @Description TODO
 * @Date 2021/1/28 19:03
 * @Created by lbj
 */
public abstract class AbstractAopProxy implements AopProxy {
    protected AdvisedSupport advisedSupport;

    public AbstractAopProxy(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }
}
