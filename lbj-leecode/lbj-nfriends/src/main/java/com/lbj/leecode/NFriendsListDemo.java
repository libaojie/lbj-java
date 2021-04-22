package com.lbj.leecode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Description N个小朋友组队，情况结果展示
 * @Date 2021/4/22 10:56
 * @File NFriendsDemo
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class NFriendsListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        ArrayList ret = function(count);
        System.out.println(ret);
    }

    private static ArrayList function(int count){
        ArrayList ret = new ArrayList();
        if (count == 1){
            ArrayList<String> team = new ArrayList<>();
            team.add("1");
            ret.add(team);
            return ret;
        }

        ArrayList<ArrayList<String>> old = function(count-1);
        for (ArrayList<String> team: old){
            // 先分别加入每种情况的每个队伍
            for (int i=0; i < team.size(); i++){
                ArrayList<String> temp = new ArrayList<>(team);
                temp.set(i,temp.get(i)+count);
                ret.add(temp);
            }
            // 新增队伍
            ArrayList<String> temp = new ArrayList<>(team);
            temp.add(""+count);
            ret.add(temp);
        }

        return ret;

    }
}
