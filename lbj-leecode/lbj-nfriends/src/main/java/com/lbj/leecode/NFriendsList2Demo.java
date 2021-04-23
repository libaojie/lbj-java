package com.lbj.leecode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Description N个小朋友组队，情况结果展示
 * @Date 2021/4/22 10:56
 * @File NFriendsDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class NFriendsList2Demo {
    static int numb = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        function(new Stack<Stack>(), count, 0, 0);
        System.out.println("共" + numb + "种情况！");
    }

    /**
     * @param count 一共多少数
     * @param cur   当前放什么数，几号小朋友
     * @param size  放了几个数
     */
    private static void function(Stack<Stack> list, int count, int cur, int size) {

        if (count == size) {
            numb++;
            System.out.println(list);
            return;
        }

        // 新添到每队中
//        for (Stack stack : list) {
//            stack.push(cur);
//            function(list, count, cur + 1, size + 1);
//            stack.pop();
//        }
        // 无法直接循环，会触发fast-fail
        for (int i = 0; i < list.size(); i++) {
            Stack stack = list.get(i);
            stack.push(cur);
            function(list, count, cur + 1, size + 1);
            stack.pop();
        }

        // 新添一列
        Stack stack = new Stack();
        stack.push(cur);
        list.push(stack);
        function(list, count, cur + 1, size + 1);
        list.pop();
    }
}
