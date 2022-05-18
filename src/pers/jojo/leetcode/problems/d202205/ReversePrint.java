package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.ListNode;

/**
 * ReversePrint
 *
 * @author 张淳
 * @date 2022/5/12 0:41
 * @description https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        ListNode cur = head;
        int[] res = new int[0];
        while (cur != null) {
            res = add(res, cur.val);
            cur = cur.next;
        }
        return res;
    }

    private int[] add(int[] res, int val) {
        int[] newRes = new int[res.length + 1];
        for (int i = 1; i < newRes.length; i++) {
            newRes[i] = res[i - 1];
        }
        newRes[0] = val;
        return newRes;
    }
}
