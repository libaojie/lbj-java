package com.lbj.leecode.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname YangHui
 * @Description 杨辉三角
 * @Date 2020/7/28 18:01
 * @Created by libaojie
 */
public class YangHui {

    public static void main(String[] args) {

        YangHui yangHui = new YangHui();
        List<List<Integer>> ret = yangHui.generate(15);
        System.out.println(ret);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = null;
            if (i == 0) {
                list = new ArrayList<Integer>();
                list.add(1);
            } else {
                list = swap(ret.get(i - 1));
            }

            ret.add(list);
        }


        return ret;

    }

    List<Integer> swap(List<Integer> list) {

        List<Integer> ret = new ArrayList<Integer>();
        ret.add(1);
        for (int i = 1; i < list.size(); i++) {
            ret.add(list.get(i)+list.get(i-1));
        }
        ret.add(1);
        return ret;
    }


}

