package com.lbj.ioc;

/**
 * @Classname PropertyValue
 * @Description 用于bean的属性注入
 * @Date 2021/1/27 15:46
 * @Created by lbj
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
