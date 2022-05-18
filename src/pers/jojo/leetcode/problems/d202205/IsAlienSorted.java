package pers.jojo.leetcode.problems.d202205;

/**
 * IsAlienSorted
 *
 * @author 张淳
 * @date 2022/5/17 19:58
 * @description https://leetcode.cn/problems/verifying-an-alien-dictionary/
 */
public class IsAlienSorted {

    public boolean isAlienSorted(String[] words, String order) {
        if (words == null || words.length == 0) {
            return true;
        }
        int[] orderMap = new int[26];
        for (int i = 0; i < order.length(); i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            int minLen = Math.min(word1.length(), word2.length());
            boolean flag = true;
            for (int j = 0; j < minLen; j++) {
                if (orderMap[word1.charAt(j) - 'a'] > orderMap[word2.charAt(j) - 'a']) {
                    return false;
                } else if (orderMap[word1.charAt(j) - 'a'] < orderMap[word2.charAt(j) - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (word1.length() > word2.length() && flag) {
                return false;
            }
        }
        return true;
    }

}
