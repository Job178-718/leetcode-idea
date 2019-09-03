/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // 确定数组 nums1 的取值范围
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        boolean[] arr = new boolean[max - min + 1];
        for (int num : nums1) {
            arr[num - min] = true;
        }

        // 判断数组 nums2 中的数是否在数组 nums1 中存在， 
        // 如果存在保存在数组 tmp 中
        int[] tmp = new int[max - min + 1];
        int idx = 0;
        for (int num : nums2) {
            if (num >= min && num <= max && arr[num - min]) {
                tmp[idx++] = num;
                arr[num- min] = false;
            }
        }

        // 返回结果
        int[] ret = new int[idx];
        for (int i = 0; i < idx; i++) {
            ret[i] = tmp[i];
        }
        return ret;
    }
}

