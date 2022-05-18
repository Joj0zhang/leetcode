package pers.jojo.leetcode.problems.d202205;

import java.util.Stack;

/**
 * CQueue
 *
 * @author 张淳
 * @date 2022/5/10 21:52
 * @description https://leetcode.cn/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.empty()) {
            if (stack1.empty()) {
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
