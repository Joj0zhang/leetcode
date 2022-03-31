package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName SingleNumber
 * @Description https://leetcode-cn.com/problems/single-number-iii/
 * @Author 张淳
 * @Date 2021/11/1 14:45
 * @Version 1.0.0
 **/
public class SingleNumber {
    public int[] singleNumber(int[] nums) {
        int a = 0;
        for (int x : nums) {
            a ^= x;
        }
        int n = 0;
        while ((a & (1 << n)) == 0) {
            n++;
        }
        int ra = 0;
        int rb = 0;
        for (int x : nums) {
            if ((x & (1 << n)) == 0) {
                ra ^= x;
            } else {
                rb ^= x;
            }
        }
        return new int[]{ra, rb};
    }
}