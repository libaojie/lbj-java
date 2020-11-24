package com.lbj.annotationtest;


import com.lbj.annotation.CheckGetter;

@CheckGetter
public class TestGetter {
    String name;
    String first;

    public String getName(){
        return this.name;
    }
}
