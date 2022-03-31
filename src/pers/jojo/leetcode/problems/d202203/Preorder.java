package pers.jojo.leetcode.problems.d202203;

import java.util.ArrayList;
import java.util.List;

/**
 * Preorder
 *
 * @author 张淳
 * @date 2022/3/10 15:14
 * @description https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/
 */
public class Preorder {
    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) {
            return res;
        }
        res.add(root.val);
        for (Node node : root.children) {
            preorder(node);
        }
        return res;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
