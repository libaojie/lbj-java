package com.lbj.niuke;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 回溯算法，计算A 的排列组合
 * @Date 2021/4/7 10:18
 * @File Test
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Test {
    public static void main(String[] args) {

        Test test = new Test();
        ArrayList<Integer> data = new ArrayList<Integer>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        test.function(data, new ArrayList<>(), 4);

    }

    private  <E> void function(List<E> source, List<E> target, int size){
        if (target.size() == size){
            // 得到结果输出
            for (E e:target){
                System.out.print(e+" ");
            }
            System.out.println();
        }

        List<E> copySource = null;
        List<E> copyTarget = null;
        for (int i = 0; i< source.size(); i++){
            copySource = new ArrayList<>(source);
            copyTarget = new ArrayList<>(target);
            copyTarget.add(copySource.get(i));
            copySource.remove(i);
            function(copySource, copyTarget, size);
        }

    }
}
