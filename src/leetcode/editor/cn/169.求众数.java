/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 求众数
 */
class Solution {
    public int majorityElement(int[] nums) {
        int result =0,count =0;
        for(int i:nums){
            if(count ==0){
                result =i;
                count++;
            }else if(result !=i){
                --count;
            }else{
                ++count;
            }
        }
    return result;        
    }
}

