package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.TreeNode;

import java.util.Arrays;
import java.util.Optional;

/**
 * Codec
 *
 * @author 张淳
 * @date 2022/5/11 9:42
 * @description https://leetcode.cn/problems/serialize-and-deserialize-bst/
 */
public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        } else {
            return root.val + "," + serialize(root.left) + "," + serialize(root.right);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        } else {
            String[] nodes = data.split(",");
            if (nodes[0].trim().equals("")) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.parseInt(nodes[0].trim()));
            boolean flag = true;
            for (int i = 1; i < nodes.length; i++) {
                if ("".equals(nodes[i].trim())) {
                    continue;
                }
                if (Integer.valueOf(nodes[i].trim()) > Integer.valueOf(nodes[0])) {
                    String l = Arrays.toString(Arrays.copyOfRange(nodes, 1, i));
                    String r = Arrays.toString(Arrays.copyOfRange(nodes, i, nodes.length));
                    root.left = deserialize(l.substring(1, l.length() - 1));
                    root.right = deserialize(r.substring(1, r.length() - 1));
                    flag = false;
                    break;
                }
            }
            if (flag) {
                String l = Arrays.toString(Arrays.copyOfRange(nodes, 1, nodes.length));
                root.left = deserialize(l.substring(1, l.length() - 1));
            }
            return root;
        }
    }
}
