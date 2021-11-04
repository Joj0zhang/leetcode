package pers.jojo.leetcode.problems;

/**
 * @ClassName DeleteNode
 * @Description https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * @Author 张淳
 * @Date 2021/11/2 09:26
 * @Version 1.0.0
 **/
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}