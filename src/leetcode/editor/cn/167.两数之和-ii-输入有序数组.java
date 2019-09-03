import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(hashMap.get(numbers[i])!=null){
                result[0]=hashMap.get(numbers[i]);
                result[1] = i+1;
                break;
            }else{
                hashMap.put(target-numbers[i],i+1);
            }
        }
        return result;
    }
}

