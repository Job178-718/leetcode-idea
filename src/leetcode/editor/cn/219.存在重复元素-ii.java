import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> Num = new HashSet<Integer>();
        int left=0,right=0;
        if(nums.length==0)return false;
        for(int i=0;i<nums.length;i++){
            if(!Num.contains(nums[i])){
                Num.add(nums[i]);
                right++;
            }else return true;
            if(right - left > k){
                Num.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}

