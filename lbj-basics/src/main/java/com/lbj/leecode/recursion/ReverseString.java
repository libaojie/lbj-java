package com.lbj.leecode.recursion;

/**
 * @Classname ReverseString
 * @Description 翻转字符串
 * @Date 2020/7/27 17:44
 * @Created by libaojie
 */

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 */
public class ReverseString {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'1','2','3','4','5'};
        solution.reverseString(s);
        System.out.println(s);
    }

}

class Solution {
    public void reverseString(char[] s) {
        f(s, 0);
    }

    private void f(char[] s, int i){

        if (i >= (s.length)/2){

            return;
        }

        char c = s[i];
        s[i] = s[s.length-1-i];
        s[s.length-1-i] = c;
        f(s, ++i);
    }

}
