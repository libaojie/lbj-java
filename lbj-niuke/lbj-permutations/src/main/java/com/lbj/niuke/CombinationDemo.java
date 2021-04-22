package com.lbj.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2021/4/21 14:51
 * @File 组合   C(r,n)  结果无序
 * C(n,m)=A(n,m)/A(m,m)=A(n,m)/m!
 * C(n,m)=C(n,n-m)=n!/m!(n,m)!
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class CombinationDemo {
    static int count = 0;

    public static void main(String[] args) {
        List<Integer> numb = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请先输入r:");
        int r = scanner.nextInt();
        System.out.println("再输入n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            numb.add(i);
        }

        function(numb, new ArrayList<>(), r, 0);
        System.out.println("C(" + r + "," + n + ")全组合数情况,共" + count + "种");
    }

    /**
     * 回溯法 查找排列组合
     *
     * @param source
     * @param target
     * @param size
     */
    private static void function(List<Integer> source, List<Integer> target, int size, int cur) {
        if (target.size() == size) {
            // 拼出一种数字组合结果
            for (int i : target) {
                System.out.print(i + " ");
            }
            count++;
            System.out.println();
        }

        List<Integer> copySource = null;
        List<Integer> copyTarget = null;

        for (int i = cur; i < source.size(); i++) {
            copySource = new ArrayList<>(source);
            copyTarget = new ArrayList<>(target);
            copyTarget.add(copySource.get(i));
            copySource.remove(i);
            function(copySource, copyTarget, size, i);
        }
    }

}
