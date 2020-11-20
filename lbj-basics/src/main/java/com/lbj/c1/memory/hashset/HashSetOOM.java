package com.lbj.c1.memory.hashset;

import java.util.HashSet;

/**
 * @Classname HashSetOOM
 * @Description TODO
 * @Date 2020/8/4 9:08
 * @Created by libaojie
 */
public class HashSetOOM {


    public static void main(String[] args) {
        HsEntry hsEntry1 = new HsEntry();
        hsEntry1.name = "demo1";

        HsEntry hsEntry2 = new HsEntry();
        hsEntry2.name = "demo2";

        System.out.println(hsEntry1.equals(hsEntry2));


        HashSet hs = new HashSet();
        hs.add(hsEntry1);
        // 加入列表能找到
        System.out.println(hs.contains(hsEntry1));

        // 修改值 之后 内存泄露
        hsEntry1.name = "demo3";
        System.out.println(hs.contains(hsEntry1));
    }
}
