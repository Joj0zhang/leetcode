package pers.jojo.leetcode.problems;

/**
 * FindCenter
 *
 * @author 张淳
 * @date 2022/2/18 10:16
 * @description https://leetcode-cn.com/problems/find-center-of-star-graph/
 */
public class FindCenter {
    public int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ? edges[0][0] : edges[0][1];
    }
}
