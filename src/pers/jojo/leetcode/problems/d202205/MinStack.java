package pers.jojo.leetcode.problems.d202205;

import java.util.Stack;

/**
 * MinStack
 *
 * @author 张淳
 * @date 2022/5/10 22:20
 * @description https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        minStack.push(minStack.isEmpty() ? x : Math.min(minStack.peek(), x));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
