package pers.jojo.leetcode.problems;

/**
 * ComplexNumberMultiply
 *
 * @author 张淳
 * @date 2022/2/25 10:12
 * @description https://leetcode-cn.com/problems/complex-number-multiplication/
 */
public class ComplexNumberMultiply {
    public String complexNumberMultiply(String num1, String num2) {
        int num1r = Integer.parseInt(num1.substring(0, num1.indexOf("+")));
        int num1i = Integer.parseInt(num1.substring(num1.indexOf("+") + 1, num1.indexOf("i")));
        int num2r = Integer.parseInt(num2.substring(0, num2.indexOf("+")));
        int num2i = Integer.parseInt(num2.substring(num2.indexOf("+") + 1, num2.indexOf("i")));
        return (num1r * num2r - num1i * num2i) + "+" + (num1r * num2i + num1i * num2r) + "i";
    }
}
