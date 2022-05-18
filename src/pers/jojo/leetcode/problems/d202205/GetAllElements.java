package pers.jojo.leetcode.problems.d202205;

import java.util.ArrayList;
import java.util.List;

/**
 * GetAllElements
 *
 * @author 张淳
 * @date 2022/5/1 22:33
 * @description https://leetcode-cn.com/problems/all-elements-in-two-binary-search-trees/
 */
public class GetAllElements {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        getList(root1, result);
        getList(root2, result);
        result.sort(Integer::compareTo);
        return result;
    }

    public void getList(TreeNode node, List<Integer> list) {
        if (node != null) {
            getList(node.left, list);
            list.add(node.val);
            getList(node.right, list);
        }
    }
}
