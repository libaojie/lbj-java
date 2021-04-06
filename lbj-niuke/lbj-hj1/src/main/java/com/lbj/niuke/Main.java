package com.lbj.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Date 2021/4/6 11:00
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        for (int i = str.length() - 1; i > -1; i--) {
            if (str.charAt(i) == ' ') {
                System.out.println(str.length() - 1 - i);
                return;
            }
        }
        System.out.println(str.length());
    }
}
