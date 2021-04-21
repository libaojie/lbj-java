package com.lbj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDemo {
    public static void main(String[] args) {

        System.out.println("整个字符串符合-------------");
        // 整个字符串符合
        String str1 = "1234567";
        String regex1 = "\\d+";
        System.out.println(str1.matches(regex1));

        System.out.println("整个字符串不符合-------------");
        // 整个字符串不符合
        String str2 = "1234567abc";
        String regex2 = "\\d+";
        System.out.println(str2.matches(regex2));

        System.out.println("整个字符串是否包含-------------");
        // 整个字符串是否包含
        String str3 = "1234567abc";
        String regex3 = "\\d+";
        Pattern patterns3 = Pattern.compile(regex3);
        Matcher matcher3 = patterns3.matcher(str3);
        System.out.println(matcher3.find());

        System.out.println("包含提取 匹配合适的数量-------------");
        // 包含提取 匹配合适的数量
        String str4 = "1234567abc6789";
        String regex4 = "(\\d+)";
        Pattern patterns4 = Pattern.compile(regex4);
        Matcher matcher4 = patterns4.matcher(str4);
        System.out.println(matcher4.groupCount());
        while(matcher4.find()){
            System.out.println(matcher4.group());
            System.out.println("*");
            System.out.println(matcher4.group(0));
            System.out.println("*");
            System.out.println(matcher4.group(1));
            System.out.println("**");
        }

        // 包含多位提取
        System.out.println("包含多位提取-------------");
        String str5 = "12abc";
        String regex5 = "(\\d+)(\\d+)";
        Pattern patterns5 = Pattern.compile(regex5);
        Matcher matcher5 = patterns5.matcher(str5);
        System.out.println(matcher5.groupCount());
        while(matcher5.find()){
            System.out.println(matcher5.group());
            System.out.println("*");
            System.out.println(matcher5.group(0));
            System.out.println("*");
            System.out.println(matcher5.group(1));
            System.out.println("*");
            System.out.println(matcher5.group(2));
            System.out.println("**");
        }

        // 包含多位指定提取
        System.out.println("包含多位指定提取-------------");
        String str6 = "12abc";
        String regex6 = "(\\d+)(?<name2>\\D+)";
        Pattern patterns6 = Pattern.compile(regex6);
        Matcher matcher6 = patterns6.matcher(str6);
        System.out.println(matcher6.groupCount());
        while(matcher6.find()){
            System.out.println(matcher6.group());
            System.out.println("*");
            System.out.println(matcher6.group(0));
            System.out.println("*");
            System.out.println(matcher6.group(1));
            System.out.println("*");
            System.out.println(matcher6.group(2));
            System.out.println("*");
            System.out.println(matcher6.group("name2"));
            System.out.println("**");
        }
    }
}
