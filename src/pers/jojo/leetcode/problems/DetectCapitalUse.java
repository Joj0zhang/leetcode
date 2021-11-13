package pers.jojo.leetcode.problems;

/**
 * @ClassName DetectCapitalUse
 * @Description https://leetcode-cn.com/problems/detect-capital/
 * @Author 张淳
 * @Date 2021/11/13 14:37
 * @Version 1.0.0
 **/
public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word) || word.toLowerCase().equals(word)) {
            return true;
        } else {
            return (word.substring(0, 1).toUpperCase().equals(word.substring(0, 1))) && (word.substring(1).toLowerCase().equals(word.substring(1)));
        }
    }
}