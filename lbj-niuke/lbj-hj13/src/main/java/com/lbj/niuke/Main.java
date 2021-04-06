package com.lbj.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Date 2021/4/6 10:29
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] ret = input.split(" ");
        int size = ret.length / 2;
        String t;
        for (int i = 0; i < size; i++) {
            t = ret[i];
            ret[i] = ret[ret.length - 1 - i];
            ret[ret.length - 1 - i] = t;
        }

        StringBuilder sb = new StringBuilder();
        for (String tt : ret) {
            sb.append(tt).append(" ");
        }
        System.out.println(sb.toString());
    }
}
