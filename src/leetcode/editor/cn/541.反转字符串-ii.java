/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 *
 * https://leetcode-cn.com/problems/reverse-string-ii/description/
 *
 * algorithms
 * Easy (47.33%)
 * Likes:    41
 * Dislikes: 0
 * Total Accepted:    5.5K
 * Total Submissions: 11.5K
 * Testcase Example:  '"abcdefg"\n2'
 *
 * 给定一个字符串和一个整数 k，你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。如果剩余少于 k
 * 个字符，则将剩余的所有全部反转。如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * 
 * 示例:
 * 
 * 
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * 
 * 
 * 要求:
 * 
 * 
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 * 
 * 
 */
class Solution {
    public String reverseStr(String s, int k) {
        for (int i = 0; i < s.length(); i=i+2*k) {
            if(s.length()-i<k){
                s = reverseString(s, i, s.length()-1);
            }else{
                s = reverseString(s, i, i+k-1);
            }
        }
        return s;
    }

    public String reverseString(String str,int start,int end){
        char [] chars = str.toCharArray();
        for (int i = start,j = end; i < j; i++,j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }
}
