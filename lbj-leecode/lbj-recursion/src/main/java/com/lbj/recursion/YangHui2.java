package com.lbj.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname YangHui
 * @Description 杨辉三角
 * @Date 2020/7/28 18:01
 * @Created by libaojie
 */
public class YangHui2 {

    public static void main(String[] args) {

        YangHui2 yangHui = new YangHui2();
        List<List<Integer>> ret = yangHui.generate(15);
        System.out.println(ret);
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        if (numRows == 0){
            return ret;
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);

        if (numRows == 1){
            ret.add(list);
            return ret;
        }

        ret = generate(numRows -1);

        if (numRows > 1){
            List<Integer> tmp = ret.get(numRows-2);
            for (int i = 1; i < tmp.size(); i++){
                list.add(tmp.get(i) + tmp.get(i-1));
            }
        }

        list.add(1);
        ret.add(list);
        return ret;

    }


}

