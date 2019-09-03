/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter = new HashMap<>(); //计数器，key为数组中的数字，value为该数字在数组中出现的次数
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            if (counter.containsKey(num)) {
                counter.put(num, counter.get(num) + 1);
            } else {
                counter.put(num, 1);
            }
        }
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            if (counter.containsKey(num) && counter.get(num) > 0) {
                counter.put(num, counter.get(num) - 1); //计数器中记录该数字的次数减1
                tempList.add(num); //将该数字添加到list中
            }
        }
        int[] result = new int[tempList.size()];
        //为满足题目返回值类型，将list转换为int数组
        for (int i = 0; i < result.length; i++) {
            result[i] = tempList.get(i);
        }
        return result;
    }
}

