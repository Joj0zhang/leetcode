package pers.jojo.leetcode.problems;

import java.util.*;

/**
 * @ClassName FindWords
 * @Description https://leetcode-cn.com/problems/keyboard-row/
 * @Author 张淳
 * @Date 2021/11/1 15:22
 * @Version 1.0.0
 **/
public class FindWords {

    public String[] findWords(String[] words) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        Set<String> set3 = new HashSet<String>();
        for (char c : "qwertyuiop".toCharArray()) {
            set1.add(String.valueOf(c));
        }
        for (char c : "asdfghjkl".toCharArray()) {
            set2.add(String.valueOf(c));
        }
        for (char c : "zxcvbnm".toCharArray()) {
            set3.add(String.valueOf(c));
        }
        List<String> strings = new ArrayList<>();
        for (String s : words) {
            Set<String> set = new HashSet<String>();
            for (char c : s.toLowerCase().toCharArray()) {
                set.add(String.valueOf(c));
            }
            if (set1.containsAll(set) || set2.containsAll(set) || set3.containsAll(set)) {
                strings.add(s);
            }
        }

        String[] r = new String[strings.size()];
        return strings.toArray(r);
    }
}