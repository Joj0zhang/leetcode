package pers.jojo.leetcode.problems;

/**
 * @ClassName IsValid
 * @Description https://leetcode-cn.com/problems/valid-parentheses/
 * @Author 张淳
 * @Date 2021/10/27 16:30
 * @Version 1.0.0
 **/
public class IsValid {

    public boolean isValid(String s) {
        String req = "";
        int a = 0;
        int b = 0;
        int cc = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    a++;
                    req = req + ')';
                    break;
                case '{':
                    b++;
                    req = req + '}';
                    break;
                case '[':
                    cc++;
                    req = req + ']';
                    break;
                case ')':

                    if (a < 1 || c != req.toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        a--;
                        req = req.substring(0, req.lastIndexOf(c));
                    }
                    break;
                case '}':
                    if (b < 1 || c != req.toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        b--;
                        req = req.substring(0, req.lastIndexOf(c));
                    }
                    break;
                case ']':
                    if (cc < 1 || c != req.toCharArray()[req.length() - 1]) {
                        return false;
                    } else {
                        cc--;
                        req = req.substring(0, req.lastIndexOf(c));
                    }
                    break;
                default:
                    break;
            }

        }
        return a == 0 && b == 0 & cc == 0;
    }
}