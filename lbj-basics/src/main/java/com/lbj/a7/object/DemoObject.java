package com.lbj.a7.object;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description TODO
 * @Date 2021/3/3 19:36
 * @File DemoObject
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class DemoObject {
    public static void main(String[] args) {
        TT t1 = new TT();
        System.out.println(ClassLayout.parseInstance(t1).toPrintable());

        int[] t2 = new int[3];
        System.out.println(ClassLayout.parseInstance(t2).toPrintable());
    }

}

class TT{
    // 全空占16byte
//    int i; // 占16byte
//    int i= 3; // 占16byte
//    String s; // 占16byte
    String s = "121"; // 占16字节

//    int[] t = new int[2];
}


