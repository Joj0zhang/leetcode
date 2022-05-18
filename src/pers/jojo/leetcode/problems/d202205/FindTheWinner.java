package pers.jojo.leetcode.problems.d202205;

import java.util.ArrayList;
import java.util.List;

/**
 * FindTheWinner
 *
 * @author 张淳
 * @date 2022/5/4 11:18
 * @description https://leetcode-cn.com/problems/find-the-winner-of-the-circular-game/
 */
public class FindTheWinner {
    public int findTheWinner(int n, int k) {
        List<Integer> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(i);
        }
        int index = 0;
        while (graph.size() > 1) {
            index = (index + k - 1) % graph.size();
            graph.remove(index);
        }
        return graph.get(0) + 1;
    }
}
