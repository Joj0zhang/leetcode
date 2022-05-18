package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LevelOrder
 *
 * @author 张淳
 * @date 2022/5/16 17:33
 * @description https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 */
public class LevelOrder {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>(List.of(root));
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        //todo
        return null;
    }

}
