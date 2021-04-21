package com.lbj.niuke;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Description TODO
 * @Date 2021/4/21 14:51
 * @File 排列   A(r,n)  结果有序
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Permutations2Demo {
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

        function(numb, n);
        System.out.println("A("+r+","+n+")全排列数情况,共"+count+"种");
    }

    /**
     * 回溯法 查找排列组合
     *
     */
    private static void function(int[] numb, int size) {

        if (stack.size() == size) {
            // 拼出一种数字组合结果
            count++;
            System.out.println(stack);
            return;
        }

        for(int i = 0; i < size; i++){
            if(!stack.contains(numb[i])){
                stack.push(numb[i]);
                function(numb,size);
                stack.pop();
            }
        }
    }

}
