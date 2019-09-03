/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i =0;
        int j=0;
        int max = 0;
        while(i<nums.length){
            if(nums[i]==1){
                j++;
                if(i+1<nums.length){
                    if(nums[i+1]!=1){
                        if(max<j){
                            max =j;
                        }
                        j=0;
                    }
                }else{
                    if(max==0||max<j){
                        max=j;
                    }
                }
            }
            i++;
        }
        return max;
    }
}

