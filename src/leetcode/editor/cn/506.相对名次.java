import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] origin = nums.clone();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], nums.length-i);
        }
        String [] model = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        String [] res = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int rank = map.get(origin[i]); 
            if(rank < 4){
                res[i] = model[rank-1];
            }else{
                res[i] = ""+rank;
            }
        }
        return res;
    }
}

