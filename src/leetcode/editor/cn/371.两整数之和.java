/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */
class Solution {
    public static int getSum(int a, int b) {
        //按位取异或
         int result = a^b;
         //判断是否需要进位
         int forward = (a&b) <<1;
         if(forward!=0){
             //如有进位，则将二进制数左移一位，进行递归
             return getSum(result,forward);
         }
         return result;
     }
}

