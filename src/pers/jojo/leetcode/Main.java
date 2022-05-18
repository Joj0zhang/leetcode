package pers.jojo.leetcode;

import pers.jojo.leetcode.problems.d202205.IsAlienSorted;

import java.util.UUID;
/**
 * @author 张淳
 * @version 1.0.0
 * @className Main
 * @description
 * @date 2021/10/26 14:25
 **/
public class Main {

    public static void main(String[] args) throws Exception {
        IsAlienSorted isAlienSorted = new IsAlienSorted();
        String[] words = {"kvup","q"};
        String order = "ngxlkthsjuoqcpavbfdermiywz";
        System.out.println(isAlienSorted.isAlienSorted(words, order));
    }

}