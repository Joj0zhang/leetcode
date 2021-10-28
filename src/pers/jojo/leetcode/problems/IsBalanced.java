package pers.jojo.leetcode.problems;


/**
 * @ClassName IsBalanced
 * @Description https://leetcode-cn.com/problems/check-balance-lcci/
 * @Author 张淳
 * @Date 2021/10/26 15:54
 * @Version 1.0.0
 **/
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    public int checkHeight(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int leftLength = checkHeight(treeNode.left);
        int rightLength = checkHeight(treeNode.right);
        if (leftLength == -1) {
            return -1;
        }
        if (rightLength == -1) {
            return -1;
        }
        if (Math.abs(leftLength - rightLength) > 1) {
            return -1;
        }
        return Math.max(leftLength, rightLength) + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}