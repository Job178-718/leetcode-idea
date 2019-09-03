/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char [] chars = word.toCharArray();
        if(Character.isUpperCase(chars[0])){
            for (int i = 2; i < chars.length; i++) {
                if(Character.isUpperCase(chars[i-1]) !=Character.isUpperCase(chars[i])){
                    return false;
                }
            }
        }else{
            for (int i = 1; i < chars.length; i++) {
                if(!Character.isLowerCase(chars[i])){
                    return false;
                }
            }
        }
        return true;
    }
}

