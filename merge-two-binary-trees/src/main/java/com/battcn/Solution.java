package com.battcn;

/**
 * 考的是递归
 *
 * @author Levin
 * @see <a href="https://leetcode-cn.com/problems/merge-two-binary-trees/description/">合并二叉树</a>
 * @since 2018/8/3 0003
 */
public class Solution {

    /**
     * 利用递归算法实现二叉树的合并
     *
     * @param tree1 第一个节点树
     * @param tree2 第二个节点树
     * @return 合并后的结果树
     */
    private static TreeNode mergeTrees(TreeNode tree1, TreeNode tree2) {
        TreeNode node = null;
        if (tree1 == null && tree2 == null) {
            return node;
        } else if (tree1 != null && tree2 == null) {
            node = tree1;
        } else if (tree2 != null && tree1 == null) {
            node = tree2;
        }
        if (tree1 != null && tree2 != null) {
            // 合并当前根节点
            node = new TreeNode(tree1.getVal() + tree2.getVal());
            // 合并当前节点左叶
            node.setLeft(mergeTrees(tree1.getLeft(), tree2.getLeft()));
            // 合并当前节点右叶
            node.setRight(mergeTrees(tree1.getRight(), tree2.getRight()));
        }
        return node;
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1);
        final TreeNode leftNode3 = new TreeNode(3);
        leftNode3.setLeft(new TreeNode(5));
        tree1.setLeft(leftNode3);
        tree1.setRight(new TreeNode(2));

        TreeNode tree2 = new TreeNode(2);
        final TreeNode leftNode1 = new TreeNode(1);
        final TreeNode rightNode3 = new TreeNode(3);
        leftNode1.setRight(new TreeNode(4));
        rightNode3.setRight(new TreeNode(7));
        tree2.setLeft(leftNode1);
        tree2.setRight(rightNode3);
        System.out.println(mergeTrees(tree1, tree2));
    }


}
