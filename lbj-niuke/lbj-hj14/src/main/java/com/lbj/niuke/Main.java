package com.lbj.niuke;

import java.util.ArrayList;
import java.util.List;
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
        if (scanner.hasNextLine()) {
            length = scanner.nextInt();
        }
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String t = scanner.next();
            for (int j = 0; j < i; j++) {
                if (ret.get(j).compareTo(t) > 0) {
                    ret.add(j, t);
                    break;
                }
            }

            if (ret.size() != i + 1) {
                ret.add(t);
            }
        }

        scanner.close();

        for (String s : ret) {
            System.out.println(s);
        }
    }
}
