/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */
class Solution {
    public boolean checkRecord(String s) {
        int mutex_A = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A'){
                mutex_A -= 1;
            }
            if(s.charAt(i) == 'L' && i<s.length()-2){
                if(s.charAt(i+1)=='L'&& s.charAt(i+2)=='L'){
                    return false;
                }
            }
            if(mutex_A<0){
                return false;
            }
        }
        return true;
    }
}
