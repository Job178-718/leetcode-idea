/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */
class Solution {
    public int countSegments(String s) {
        if(s.trim().length()==0) 
            return 0;
        else
            return s.trim().split("\\s+").length;
    }
}

