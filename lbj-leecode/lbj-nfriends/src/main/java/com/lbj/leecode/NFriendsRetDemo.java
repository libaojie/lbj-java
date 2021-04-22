package com.lbj.leecode;

import java.util.Scanner;

/**
 * @Description N个小朋友组队，情况结果计算
 * @Date 2021/4/22 10:56
 * @File NFriendsDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class NFriendsRetDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] ret = function(count);
        int sum = 0;
        for(int i : ret){
            sum += i;
        }
        System.out.println(sum);
    }

    private static int[] function(int count){
        int[] ret = new int[count];
        if (count == 1){
            ret[0] = 1;
            return ret;
        }
        // 先获取未新增成员的情况
        int[] old = function(count -1);
        // 每种队伍情况
        int before = 0;
        // 保持当前队伍数 基础值+当前队伍数x当前情况数
        for (int i = 0; i < count; i++){
            if (i < old.length){
                ret[i] = before + (i+1)*old[i];
                // 将不加入的放入 作为下一位的基础值
                before = old[i];
            }else{
                ret[i] = before;
            }
        }
        return ret;
    }
}
