package pers.jojo.leetcode.problems.d202203;

/**
 * MaxConsecutiveAnswers
 *
 * @author 张淳
 * @date 2022/3/29 16:08
 * @description https://leetcode-cn.com/problems/maximize-the-confusion-of-an-exam/
 */
public class MaxConsecutiveAnswers {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'));
    }

    public int maxConsecutiveChar(String answerKey, int k, char ch) {
        int ans = 0;
        for (int left = 0, right = 0, sum = 0; right < answerKey.length(); ) {
            sum += answerKey.charAt(right) != ch ? 1 : 0;
            while (sum > k) {
                sum -= answerKey.charAt(left) != ch ? 1 : 0;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
