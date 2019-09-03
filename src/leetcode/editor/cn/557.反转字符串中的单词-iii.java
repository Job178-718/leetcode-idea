/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */
class Solution {
    public String reverseWords(String s) {
        String [] strs = s.split(" ");
        String result = "";
        for (String var : strs) {
            result += resver(var);
        }
        return result.trim();
    }
    public String resver(String s){
        StringBuffer stringBuffer = new StringBuffer(s);
        return " "+stringBuffer.reverse().toString();
    }
}

