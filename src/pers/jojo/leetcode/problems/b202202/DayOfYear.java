package pers.jojo.leetcode.problems.b202202;

import java.util.Calendar;

/**
 * @ClassName DayOfYear
 * @Description https://leetcode-cn.com/problems/day-of-the-year/
 * @Author 张淳
 * @Date 2021/12/21 13:30
 * @Version 1.0.0
 **/
public class DayOfYear {
    public int dayOfYear(String date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.valueOf(date.substring(0, 4)), Integer.valueOf(date.substring(5, 7))-1, Integer.valueOf(date.substring(8, 10)));
        return calendar.get(Calendar.DAY_OF_YEAR);
    }
}