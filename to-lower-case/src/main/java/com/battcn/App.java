package com.battcn;

/**
 * @author Levin
 * @see <a href="https://leetcode-cn.com/problems/to-lower-case/description/">转换成小写字母</a>
 * @since 2018/8/3 0003
 */
public class App {

    private static String toLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        final char[] chars = str.toCharArray();
        for (char s : chars) {
            result.append(Character.toLowerCase(s));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        // String 自带 API
        System.out.println("BATTCN".toLowerCase());

    }


}
