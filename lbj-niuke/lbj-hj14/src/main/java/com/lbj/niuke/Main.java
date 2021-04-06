package com.lbj.niuke;

import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2021/4/6 9:48
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        if (scanner.hasNextLine()){
            length = scanner.nextInt();
        }
        String[] ret = new String[length];
        int i = 0;
        while (scanner.hasNextLine()){
            ret[i] = scanner.nextLine();
        }
        System.out.print(ret);
    }
}
