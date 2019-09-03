/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 */
class NumArray {
    static int [] nums;
    public NumArray(int[] nums) {
        this.nums= nums;
    }
    
    public int sumRange(int i, int j) {
        int sum =0;
        if(i==j){
            return this.nums[i];
        }else{
            for(;i<=j;i++){
                sum+=this.nums[i];
            }
            return sum;
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

