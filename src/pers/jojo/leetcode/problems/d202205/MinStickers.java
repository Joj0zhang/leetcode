package pers.jojo.leetcode.problems.d202205;

/**
 * MinStickers
 *
 * @author 张淳
 * @date 2022/5/14 20:39
 * @description https://leetcode.cn/problems/stickers-to-spell-word/
 */
public class MinStickers {
    public int minStickers(String[] stickers, String target) {
        int[] targetCount = new int[26];
        for (char c : target.toCharArray()) {
            targetCount[c - 'a']++;
        }
        int[] stickerCount = new int[26];
        int min = Integer.MAX_VALUE;
        for (String sticker : stickers) {
            for (char c : sticker.toCharArray()) {
                stickerCount[c - 'a']++;
            }
            int[] temp = new int[26];
            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (targetCount[i] > 0) {
                    temp[i] = Math.min(targetCount[i], stickerCount[i]);
                    count += temp[i];
                }
            }
            if (count == target.length()) {
                min = Math.min(min, sticker.length());
            }
            for (int i = 0; i < 26; i++) {
                stickerCount[i] = temp[i];
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
