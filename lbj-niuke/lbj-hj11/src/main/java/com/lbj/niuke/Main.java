package com.lbj.niuke;

import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2021/4/6 9:28
 * @File Demo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String input = "";
        // 判断是否还有输入
        if (scan.hasNextLine()) {
            input = scan.nextLine();
        }
        scan.close();
        for (int i = input.length() -1; i > -1; i--){
            System.out.print(input.charAt(i));
        }
    }
}
