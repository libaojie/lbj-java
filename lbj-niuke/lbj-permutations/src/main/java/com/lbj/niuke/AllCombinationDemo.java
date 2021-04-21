package com.lbj.niuke;

import java.util.Scanner;

/**
 * @Description TODO
 * @Date 2021/4/21 14:51
 * @File 全组合   C(1,n)+C(2,n)+...+C(n,n)
 * @Version v1.0
 * @Date 2021/2/5 14:56
 * @Created by libaojie
 */
public class AllCombinationDemo {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请先输入r:");
        int r = scanner.nextInt();
        System.out.println("再输入n:");
        int n = scanner.nextInt();
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = i;
        }

        int nBit = (0xFFFFFFFF >>> (32 - n));

        for (int i = 1; i <= nBit; i++) {
            for (int j = 0; j < n; j++) {
                if ((i << (31 - j)) >> 31 == -1) {
                    System.out.print(numb[j] + " ");
                }
            }
            System.out.println("");
            count++;
        }

        System.out.println("A(" + r + "," + n + ")全排列数情况,共" + count + "种");
    }


}
/**
 * 当n大于2时，n个数的全组合一共有(2^n)-1种。
 * 当对n个元素进行全组合的时候，可以用一个n位的二进制数表示取法。
 * 1表示在该位取，0表示不取。例如，对ABC三个元素进行全组合，  100表示取A，010表示取B，001表示取C，101表示取AC  110表示取AB，011表示取BC，111表示取ABC
 * 注意到表示取法的二进制数其实就是从1到7的十进制数
 * 推广到对n个元素进行全排列，取法就是从1到2^n-1的所有二进制形式
 * 要取得2^n，只需将0xFFFFFFFF左移32-n位，再右移回来就可以了。
 **/