package com.lbj.annotation;

@CheckGetter
public class TestGetter {
    String name;
    String first;

    public String getName(){
        return this.name;
    }
}
