package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.ListNode;

/**
 * ReverseList
 *
 * @author 张淳
 * @date 2022/5/12 0:47
 * @description https://leetcode.cn/problems/fan-zhuan-lian-biao-lcof/
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
