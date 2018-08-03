package com.battcn;

/**
 * 初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，换言之就是判断它是否会移回到原来的位置。
 * <p>
 * 移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
 *
 * @author Levin
 * @since 2018/8/3 0003
 */
public class App {

    private static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        // 获取指令
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y++;
                    break;
                case 'R':
                    y--;
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0;
    }


    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("UL"));
        System.out.println(judgeCircle("LR"));
    }

}
