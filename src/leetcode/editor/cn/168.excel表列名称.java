/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */
class Solution {
    public String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        while(n>0){
            int ch = (int)'A'+(n-1)%26;
            result.append((char)ch);
            n=(n-1)/26;
        }
        return result.reverse().toString();
    }
}

