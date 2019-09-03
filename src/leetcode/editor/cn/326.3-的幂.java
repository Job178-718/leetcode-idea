/*
 * @lc app=leetcode.cn id=326 lang=java
 *
 * [326] 3的幂
 */
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<3&&n!=1){
            return false;
        }else{
            while(n>1){
                if(n%3!=0){
                    return false;
                }else{
                    n= n/3;
                }
            }
            return n==1?true:false;
        }
    }
}

