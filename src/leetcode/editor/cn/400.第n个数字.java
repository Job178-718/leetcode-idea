/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第N个数字
 */
class Solution {
    public int findNthDigit(int n) {
        int len = 1;//用于记录所在数字的位数
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;//找到所在的那个数
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }//确定具体在第几位
}

