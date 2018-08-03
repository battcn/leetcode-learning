package com.battcn;

/**
 * 汉明距离：将一个字符串变换成另外一个字符串所需要替换的字符个数
 *
 * @author Levin
 * @see <a href="https://leetcode-cn.com/problems/hamming-distance/description/">汉明距离</a>
 * @since 2018/8/3 0003
 */
public class App {

    private static int hammingDistance(int x, int y) {
        // ^ 异或运算：不同取 1 相同取 0
        // 1 =  0001
        // 4 =  0100 异或运算结果就是 0101 = 5
        // 在线进制转换 http://tool.oschina.net/hexconvert
        // Integer.toBinaryString(num);
        int sum = x ^ y;
        int count;
        for (count = 0; sum > 0; count++) {
            // & 与运算：都为 1 时才 为 1
            //sum &= (sum - 1);
            // 第一次循环计算结果
            // 4 = 5 & (5 - 1)
            // 0100 = 0101 & 0100
            sum = sum & (sum - 1);
            // 第二次计算结果
            // 0 = 4 & (4 - 1)
            // 0000 = 0100 & 0011
        }
        return count;
    }

    public static void main(String[] args) {
        // 1 = 0001   101 =  1100101 那么他们的汉明距离就是 2
        System.out.println(hammingDistance(1, 4));
    }


}
