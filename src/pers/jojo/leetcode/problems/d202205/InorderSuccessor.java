package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.TreeNode;

/**
 * InorderSuccessor
 *
 * @author 张淳
 * @date 2022/5/16 16:14
 * @description https://leetcode.cn/problems/successor-lcci/
 */
public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        if (root.val <= p.val) {
            return inorderSuccessor(root.right, p);
        } else {
            TreeNode left = inorderSuccessor(root.left, p);
            return left == null ? root : left;
        }
    }
}
