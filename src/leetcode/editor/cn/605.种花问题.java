import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            if (n <= 1) {
                return true;
            }
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int nums = 1;
        for (int i = 0; i < flowerbed.length;i++) {
            if (flowerbed[i]!=1){
                nums++;
            }else {
                arrayList.add(nums);
                nums = 0;
            }

        }
        arrayList.add(nums+1);
        int sum = 0;
        for (int num : arrayList) {
            sum += (num-1)/2;
        }
        return sum>=n;
    }
}

