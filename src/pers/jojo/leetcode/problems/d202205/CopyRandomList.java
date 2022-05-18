package pers.jojo.leetcode.problems.d202205;

import pers.jojo.leetcode.problems.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * CopyRandomList
 *
 * @author 张淳
 * @date 2022/5/12 19:39
 * @description https://leetcode.cn/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */
public class CopyRandomList {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
