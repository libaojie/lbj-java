package com.lbj.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

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
public class Combination2Demo {
    static int count = 0;
    public static Stack<Integer> stack = new Stack<Integer>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请先输入r:");
        int r = scanner.nextInt();
        System.out.println("再输入n:");
        int n = scanner.nextInt();
        int[] numb = new int[n];
        for (int i = 0; i < n; i++){
            numb[i] = i;
        }

        function(numb, r, 0);
        System.out.println("C("+r+","+n+")全组合数情况,共"+count+"种");
    }

    /**
     * 递归
     *
     */
    private static void function(int[] numb, int size, int cur) {

        if (stack.size() == size) {
            // 拼出一种数字组合结果
            count++;
            System.out.println(stack);
            return;
        }

        for(int i = cur; i < numb.length; i++){
            if(!stack.contains(numb[i])){
                stack.push(numb[i]);
                function(numb,size, i);
                stack.pop();
            }
        }
    }

}
