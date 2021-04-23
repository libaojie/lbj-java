package com.lbj.dangdang;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * 当当优惠
 *
 * @Date 2021/4/22 10:56
 * @File NFriendsDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class DangdangDemo {
    // 统计情况
    static int numb = 0;
    // 索引全排列组合
    static Stack<Stack> list = new Stack<Stack>();
    // 每件商品价格
    static ArrayList<Float> prices = new ArrayList<>();
    // 最优惠价格
    static float sum = 0;
    // 最优惠分组
    static ArrayList<Team> teamList = new ArrayList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入商品总数量：");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("请第"+(i+1)+"件商品价格：");
            prices.add(scanner.nextFloat());
        }
        scanner.close();
        // 全排列分批
        function(count, 0, 0);
        System.out.println("共" + numb + "种情况！");
        System.out.println("最优惠方案：");
        for (int i = 0; i < teamList.size(); i++) {
            teamList.get(i).print();
        }
        System.out.println("共花费：" + sum);
    }

    /**
     * 计算价格
     */
    private static void addPrice() {
        float sumTemp = 0;
        ArrayList teamListTeam = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Team team = new Team(i, list.get(i));
            sumTemp += team.newPrice;
            teamListTeam.add(team);
        }

        // 更优惠
        if (sum < 0.5 || sum > sumTemp) {
            teamList = teamListTeam;
            sum = sumTemp;
        }
    }

    /**
     * @param count 一共多少数
     * @param cur   当前放什么数，几号小朋友
     * @param size  放了几个数
     */
    private static void function(int count, int cur, int size) {

        if (count == size) {
            numb++;
//            System.out.println(list);
            addPrice();
            return;
        }

        // 无法直接循环，会触发fast-fail
        for (int i = 0; i < list.size(); i++) {
            Stack stack = list.get(i);
            stack.push(cur);
            function(count, cur + 1, size + 1);
            stack.pop();
        }

        // 新添一列
        Stack stack = new Stack();
        stack.push(cur);
        list.push(stack);
        function(count, cur + 1, size + 1);
        list.pop();
    }

    static class Team {
        // 单号
        int index = 0;
        // 原价
        float oldPrice = 0f;
        // 打折后价格
        float newPrice = 0f;
        // 商品索引
        ArrayList<Integer> indexList = new ArrayList<>();
        // 价格索引
        ArrayList<Float> priceList = new ArrayList<>();

        public Team(int index, Stack stack) {
            this.index = index + 1;
            for (int i = 0; i < stack.size(); i++) {
                int indexTemp = (int) stack.get(i);
                float price = prices.get(indexTemp);
                indexList.add(indexTemp);
                priceList.add(price);
                oldPrice += price;
                newPrice += price;
            }

            // 每满100减50
            newPrice = newPrice - ((int) oldPrice) / 100 * 50;
            // 叠加 满150减30 或满100减10
            if (newPrice > 150) {
                newPrice -= 30;
            } else if (newPrice > 100) {
                newPrice -= 10;
            }
        }

        public void print() {
            System.out.println("第【" + index + "】单，原价：【" + oldPrice + "】，优惠后：【" + newPrice + "】");
            for (int i = 0; i < indexList.size(); i++) {
                System.out.println((i + 1) + ".第【" + (indexList.get(i) + 1) + "】件，价格为【" + priceList.get(i) + "】");
            }
            System.out.println();
        }

    }
}
