package com.lbj.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname YangHui3
 * @Description TODO
 * @Date 2020/7/30 17:16
 * @Created by libaojie
 */
public class YangHui3 {

    public static void main(String[] args) {

        YangHui3 yangHui = new YangHui3();
        List<Integer> ret = yangHui.getRow(3);
        System.out.println(ret);
    }

    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        return getRow1(rowIndex);

    }

    public List<Integer> getRow1(int rowIndex) {
        List<Integer> ret = new ArrayList<Integer>();
        if (rowIndex == 0) {
            return ret;
        }

        if (rowIndex == 1) {
            ret.add(1);
            return ret;
        }

        ret = getRow1(rowIndex - 1);

        int t = 1;
        for (int i = 1; i < ret.size(); i++) {
            int tt = ret.get(i);
            ret.set(i, tt + t);
            t = tt;
        }
        ret.add(1);
        return ret;

    }
}
