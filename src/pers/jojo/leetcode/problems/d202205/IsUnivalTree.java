package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.TreeNode;

/**
 * IsUnivalTree
 *
 * @author 张淳
 * @date 2022/5/24 14:08
 * @description https://leetcode.cn/problems/univalued-binary-tree/
 */
public class IsUnivalTree {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        //遍历整棵树
        return isUnivalTree(root.left, root.val) && isUnivalTree(root.right, root.val);
    }

    private boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        return root.val == val && isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }
}
