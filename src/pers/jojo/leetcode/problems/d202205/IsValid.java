package pers.jojo.leetcode.problems.d202205;

import javax.xml.validation.SchemaFactory;

/**
 * IsValid
 *
 * @author 张淳
 * @date 2022/5/2 23:42
 * @description https://leetcode-cn.com/problems/tag-validator/
 */
public class IsValid {

    public boolean isValid(String code) {
        code = code.replaceAll("<!\\[CDATA\\[.*?\\]\\]>|t", "-");
        String temp = "";
        while (!temp.equals(code)) {
            temp = code;
            code = code.replaceFirst("<([A-Z]{1,9})>[^<]*</\\1>", "a");
        }
        return "a".equals(code);
    }

}
