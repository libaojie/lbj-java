package com.lbj.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2021/4/6 10:14
 * @File Main1
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main1 {

    public static void main(String[] args) throws Exception {
        // 输入改为这样比较省时
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bf.readLine());
        String[] ret = new String[count];
        for (int i = 0; i < count; i++) ret[i] = bf.readLine();
        Arrays.sort(ret);
        for (int i = 0; i < count; i++){
            // 此处比较耗时
            System.out.println(ret[i]);
        }
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(bf.readLine());
//        String[] result = new String[count];
//        for (int i = 0; i < count; i++) result[i] = bf.readLine();
//        StringBuilder sb = new StringBuilder();
//        Arrays.sort(result);
//        for (String w : result) sb.append(w).append('\n');
//        System.out.println(sb.toString());
    }
}
