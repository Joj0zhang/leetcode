package pers.jojo.leetcode.problems;

/**
 * Node
 *
 * @author 张淳
 * @date 2022/5/12 0:51
 * @description Node
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}