package pers.jojo.leetcode.problems.d202205;

import java.util.*;

/**
 * MinMutation
 *
 * @author 张淳
 * @date 2022/5/8 12:52
 * @description https://leetcode-cn.com/problems/minimum-genetic-mutation/
 */
public class MinMutation {
    //输出由start到end的最短变异序列的长度
    public int minMutation(String start, String end, String[] bank) {
        Set<String> cnt = new HashSet<String>();
        Set<String> visited = new HashSet<String>();
        char[] keys = {'A', 'C', 'G', 'T'};
        for (String s : bank) {
            cnt.add(s);
        }
        //如果start和end相同，返回0
        if (start.equals(end)) {
            return 0;
        }
        //如果end不在bank中，返回-1
        if (!cnt.contains(end)) {
            return -1;
        }

        Queue<String> queue = new ArrayDeque<String>();
        queue.offer(start);
        visited.add(start);
        int level = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                //如果cur和end相同，返回level
                if (cur.equals(end)) {
                    return level;
                }
                //遍历cur的所有可能的变异序列
                for (int j = 0; j < cur.length(); j++) {
                    char[] chars = cur.toCharArray();
                    for (char c : keys) {
                        if (c != cur.charAt(j)) {
                            chars[j] = c;
                            String next = new String(chars);
                            //如果next在bank中，并且没有被访问过，加入队列
                            if (cnt.contains(next) && !visited.contains(next)) {
                                queue.offer(next);
                                visited.add(next);
                            }
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}