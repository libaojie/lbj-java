package com.lbj.fibonacci;

/**
 * @Classname Fibonacci
 * @Description TODO
 * @Date 2020/7/27 15:15
 * @Created by libaojie
 */
public class Fibonacci {


    public static void main(String[] args) {
        System.out.println(get(9));
    }


    public static int get(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1){
            return 1;
        }

        return get(index - 1) + get(index - 2);

    }

}
