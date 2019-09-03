import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int num :nums){
            hashSet.add(num);
        }
        if(hashSet.size()==nums.length){
            return false;
        }else{
            return true;
        }
    }
}

