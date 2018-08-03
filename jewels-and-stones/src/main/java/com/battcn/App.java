package com.battcn;

import java.util.Objects;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 * @author Levin
 * @see <a href="https://leetcode-cn.com/problems/jewels-and-stones/description/">宝石与石头</a>
 * @since 2018/8/3 0003
 */
public class App {

    /**
     * 普通写法
     *
     * @param jewel 宝石
     * @param stone 石头
     * @return 返回检索出来的宝石个数
     */
    private static int numJewelsInStones(String jewel, String stone) {
        int count = 0;
        // 获取宝石种类
        String[] jewels = jewel.split("");
        final String[] stones = stone.split("");
        for (String s : stones) {
            for (String j : jewels) {
                if (Objects.equals(j, s)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 采用 JDK8 写法
     *
     * @param jewel 宝石
     * @param stone 石头
     * @return 返回检索出来的宝石个数
     */
    private static long numJewelsInStones1(String jewel, String stone) {
        return jewel.chars().mapToLong(j -> stone.chars().filter(s -> s == j).count()).sum();
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones1("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

}
