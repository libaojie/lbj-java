package com.lbj.niuke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2021/4/6 16:27
 * @File Main
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String[] strArray = str.split(" ");
        List<Integer> numb = new ArrayList<>();
        // 处理四个数字
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals("joker") || strArray[i].equals("JOKER")) {
                System.out.println("ERROR");
                return;
            }
            switch (strArray[i]) {
                case "A":
                    numb.add(1);
                    continue;
                case "J":
                    numb.add(11);
                    continue;
                case "Q":
                    numb.add(12);
                    continue;
                case "K":
                    numb.add(13);
                    continue;
                default:
                    numb.add(Integer.parseInt(strArray[i]));
            }
        }

        function(numb, new ArrayList<>(), 4);
        // 无法计算出结果
        System.out.println("NONE");
    }

    /**
     * 回溯法 查找排列组合
     *
     * @param source
     * @param target
     * @param size
     */
    private static void function(List<Integer> source, List<Integer> target, int size) {

        if (target.size() == size) {
            // 拼出一种数字组合结果
            operation(target);
//            for (int i : target){
//                System.out.print(i+" ");
//            }
//            System.out.println();

        }

        List<Integer> copySource = null;
        List<Integer> copyTarget = null;

        for (int i = 0; i < source.size(); i++) {
            copySource = new ArrayList<>(source);
            copyTarget = new ArrayList<>(target);
            copyTarget.add(copySource.get(i));
            copySource.remove(i);
            function(copySource, copyTarget, size);
        }
    }

    /**
     * 计算符号
     * @param data
     */
    private static void operation(List<Integer> data) {

        String[] c = new String[3];
        // 开始四则运算，共3个空，每个空4种可能，共64种可能符号
        for (int i = 0; i < 64; i++) {
            int ret = data.get(0);
            for (int j = 1; j < 4; j++){
                // 四进制算法
                int index = i / (int)Math.pow(4, j-1) % 4;

                if (index == 0) {
                    // 加法
                    ret = ret + data.get(j);
                    c[j - 1] = "+";
                } else if (index == 1) {
                    // 减法
                    ret = ret - data.get(j);
                    c[j - 1] = "-";
                } else if (index == 2) {
                    // 乘法
                    ret = ret * data.get(j);
                    c[j - 1] = "*";
                } else {
                    // 除法
                    if (ret % data.get(j) != 0) {
                        // 无法整除，不能做除法,强制清除
                        ret = 0;
                        break;
                    }
                    ret = ret / data.get(j);
                    c[j - 1] = "/";
                }
            }

            // 找到一种计算结果组合
            if (ret == 24) {
                StringBuilder sb = new StringBuilder();
                sb.append(getChar(data.get(0)));
                for (int j = 0; j < c.length; j++) {
                    sb.append(c[j]).append(getChar(data.get(j + 1)));
                }
                System.out.println(sb.toString());
                // 找到一种可能即关闭程序
                System.exit(0);
            }
        }
    }

    /**
     * 转化字符串
     * @param numb
     * @return
     */
    private static String getChar(int numb){
        switch (numb) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            default:
                return String.valueOf(numb);
        }
    }

}
