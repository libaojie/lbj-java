package com.lbj.niuke;

import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2021/4/6 9:42
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        if (scanner.hasNextLine()){
            input = scanner.nextLine();
        }
        scanner.close();

        for (int i = input.length() -1; i > -1; i--){
            System.out.print(input.charAt(i));
        }
    }
}
