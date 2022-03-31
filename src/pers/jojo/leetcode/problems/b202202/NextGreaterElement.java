package pers.jojo.leetcode.problems.b202202;

/**
 * @ClassName NextGreaterElement
 * @Description https://leetcode-cn.com/problems/next-greater-element-i/
 * @Author 张淳
 * @Date 2021/10/26 15:21
 * @Version 1.0.0
 **/
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    int temp = -1;
                    A:
                    for (int k = j; k < nums2.length; k++) {
                        if (nums1[i] < nums2[k]) {
                            temp = nums2[k];
                            break A;
                        }
                    }
                    nums1[i] = temp;
                    break;
                }
            }
        }
        return nums1;
    }
}