/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 *
 * https://leetcode-cn.com/problems/merge-sorted-array/description/
 *
 * algorithms
 * Easy (43.73%)
 * Total Accepted:    40.5K
 * Total Submissions: 92.6K
 * Testcase Example:  '[1,2,3,0,0,0]\n3\n[2,5,6]\n3'
 *
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * 
 * 说明:
 * 
 * 
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 
 * 
 * 示例:
 * 
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * 
 * 输出: [1,2,2,3,5,6]
 * 
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        int start = 0;
        int end = m+n-1;
        quickSort(nums1, 0, m+n-1);
    }
    public static void quickSort(int[] numbers, int start, int end) {   
        if (start < end) {   
            int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
            int temp; // 记录临时中间值   
            int i = start, j = end;   
            do {   
                while ((numbers[i] < base) && (i < end))   
                    i++;   
                while ((numbers[j] > base) && (j > start))   
                    j--;   
                if (i <= j) {   
                    temp = numbers[i];   
                    numbers[i] = numbers[j];   
                    numbers[j] = temp;   
                    i++;   
                    j--;   
                }   
            } while (i <= j);   
            if (start < j)   
                quickSort(numbers, start, j);   
            if (end > i)   
                quickSort(numbers, i, end);   
        }   
    }  
}
