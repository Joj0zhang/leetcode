package pers.jojo.leetcode.problems.d202205;

/**
 * MinMutation
 *
 * @author 张淳
 * @date 2022/5/7 15:29
 * @description https://leetcode-cn.com/problems/minimum-genetic-mutation/
 */
public class MinMutation {
    public int minMutation(String start, String end, String[] bank) {
        int[] visited = new int[bank.length];
        int[] distance = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[getIndex(start, bank)] = 0;
        int min = Integer.MAX_VALUE;
        while (true) {
            int minIndex = -1;
            for (int i = 0; i < bank.length; i++) {
                if (visited[i] == 0 && distance[i] < min) {
                    min = distance[i];
                    minIndex = i;
                }
            }
            if (minIndex == -1) {
                break;
            }
        }
        return min;
    }

    private int getIndex(String start, String[] bank) {
        for (int i = 0; i < bank.length; i++) {
            if (bank[i].equals(start)) {
                return i;
            }
        }
        return -1;
    }


}
