package com.lbj.proxy;

public class Lenovo implements SaleComputer {
    public String sale(double money) {
        System.out.println("花了" + money + "钱买了联想");
        return "联想电脑";
    }

    public void show() {
        System.out.print("展示联想电脑");
    }
}
