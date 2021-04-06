package com.lbj.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Description TODO
 * @Date 2021/4/6 11:38
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main  {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine()) != null){
            StringBuilder sb = new StringBuilder();
            boolean[] ret = new boolean[1000];
            int num = Integer.parseInt(str);
            for (int i = 0; i < num;i++){
                ret[Integer.parseInt(bf.readLine())-1]= true;
            }

            for (int i = 0; i < 1000;i++){
                if (ret[i]){
                    sb.append(i+1).append("\n");
                }
            }
;            System.out.println(sb.substring(0, sb.length()-1));
        }
    }
}
