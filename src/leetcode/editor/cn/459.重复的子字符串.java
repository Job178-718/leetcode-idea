/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */
class Solution {
    public static boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        int i = 1;
        boolean flag = false;
        while(i<=len/2) {//逐一判断
            if(len % i == 0) {
                flag = check(str,i);//当前长度可不可得到重复子串
            }
            i++;
            if(flag) break;
        }
        return flag;
    }
    public static boolean check(String str,int distance) {//方法具体实现
        int len = str.length();
        for(int i=0;i<distance;i++) {
            for(int j=i+distance;j<len;j += distance) {
                if(str.charAt(i) != str.charAt(j))
                    return false;
            }
        }
        return true;
    }
}


