/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */
class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        char[] chs = s.toCharArray();
        for(char ch :chs){
            result *=26;
            result+=(int)ch-'A'+1;
        }
        return result;
    }
}

