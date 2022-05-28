package pers.jojo.leetcode.problems;

/**
 * TreeNode
 *
 * @author 张淳
 * @date 2022/5/11 14:12
 * @description TreeNode
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int x) {
        val = x;
    }


    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
