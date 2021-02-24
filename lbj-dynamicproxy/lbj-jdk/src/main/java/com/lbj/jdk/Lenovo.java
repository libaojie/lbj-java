package com.lbj.jdk;

/**
 * @Description TODO
 * @Date 2021/2/24 16:15
 * @File Lenovo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Lenovo implements SaleComputer{
    @Override
    public String sale(double money) {
        System.out.println("花了" + money + "钱买了联想");
        return "联想电脑";
    }

    @Override
    public void show() {
        System.out.print("展示联想电脑");
    }
}
