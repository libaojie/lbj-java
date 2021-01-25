package com.lbj.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchChinese {
    public static void main(String[] args) {
        String str = "閑人到人间";
        Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
