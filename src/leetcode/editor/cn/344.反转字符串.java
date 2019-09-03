/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */
class Solution {
    public void reverseString(char[] s) {
        int i = 0,j=s.length-1;
        while(i<j){
            exchange(s, i, j);
            i++;
            j--;
        }
    }
    public void exchange(char[] s, int i ,int j){
        char tmp;
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}

