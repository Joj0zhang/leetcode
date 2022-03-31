package pers.jojo.leetcode.problems.b202202;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 需求：
 * 现有一个仅包涵 '('，')'，'{'，'}'，'['，']' 的字符串 s ，设计一个函数判断该字符串是否有效。
 * 有效字符串需满足：左括号必须由相同类型的右括号按序闭合。
 * 示例：
 * 输入：s = "()"               输出：true
 * 输入：s = "(]"               输出：false
 * 输入：s = "[({)}]"           输出：false
 * 输入：s = "{({})[()]()}"     输出：true
 * **********************************************************************************************
 * 现有三个实现isValid1、isValid2和isValid3，请仔细评阅相关代码并尝试回答以下问题
 * 一、解释isValid1中，变量x、y、z的作用；
 * 二、isValid2中使用到了java.util.Deque，请简述其与java.util.Collection的关系；
 * 三、判断isValid3的正确性，若不正确，请给出反例，并尝试改正它；
 * 四、就时间复杂度和空间复杂度两个角度，对上述三个方法进行比较。
 **/

public class IsValid {
    public boolean isValid1(String s) {
        StringBuilder req = new StringBuilder();
        int x = 0;
        int y = 0;
        int z = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    x++;
                    req.append(')');
                    break;
                case '{':
                    y++;
                    req.append('}');
                    break;
                case '[':
                    z++;
                    req.append(']');
                    break;
                case ')':

                    if (x < 1 || c != req.toString().toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        x--;
                        req = new StringBuilder(req.substring(0, req.toString().lastIndexOf(c)));
                    }
                    break;
                case '}':
                    if (y < 1 || c != req.toString().toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        y--;
                        req = new StringBuilder(req.substring(0, req.toString().lastIndexOf(c)));
                    }
                    break;
                case ']':
                    if (z < 1 || c != req.toString().toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        z--;
                        req = new StringBuilder(req.substring(0, req.toString().lastIndexOf(c)));
                    }
                    break;
                default:
                    break;
            }
        }
        return x == 0 && y == 0 && z == 0;
    }

    public boolean isValid2(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                deque.push(c);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                char topChar = deque.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
            i++;
        }
        return deque.isEmpty();
    }

    public boolean isValid3(String s) {
        boolean flag = true;
        while (flag) {
            flag = false;
            if (s.contains("()")) {
                s = s.replace("()", "");
                flag = true;
            }
            if (s.contains("{}")) {
                s = s.replace("{}", "");
                flag = true;
            }
            if (s.contains("[]")) {
                s = s.replace("[]", "");
                flag = true;
            }
        }
        return s.length() == 0;
    }
}