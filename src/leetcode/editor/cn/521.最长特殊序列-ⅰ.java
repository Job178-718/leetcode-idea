/*
 * @lc app=leetcode.cn id=521 lang=java
 *
 * [521] 最长特殊序列 Ⅰ
 */
class Solution {
    public int findLUSlength(String a, String b) {
        if (a.length() == b.length()) {
            if(!a.equals(b)){
                return a.length();
            }else{
                return -1;
            }
        } else {

            return Math.max(a.length(), b.length());
        }
    }
}

