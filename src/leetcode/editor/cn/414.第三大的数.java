import java.util.Arrays;

import sun.security.util.Length;

/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */
class Solution {
    public int thirdMax(int[] nums) {
        int max=Integer.MIN_VALUE;
        int [] max_list =new int[2];
        for (int i : nums) {
            if(i>=max){
                max = i;
            }
        }
        max_list[0]=max;
        max = Integer.MIN_VALUE;
        for (int i : nums) {
            if(i>=max&&i!=max_list[0]){
                max = i;
            }
        }
        max_list[1]=max;
        max = Integer.MIN_VALUE;
        int flag=0;
        for (int i : nums) {

            if(i>=max&&i!=max_list[0]&&i!=max_list[1]){
                max = i;
                flag=1;
            }
        }
        if(max==Integer.MIN_VALUE &&flag==0){
            return max_list[0];
        }else{
            return max;
        }

    }
}

