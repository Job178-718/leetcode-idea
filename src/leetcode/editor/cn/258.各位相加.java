import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */
class Solution {
    public int addDigits(int num) {
        if (num<10) return num;
        ArrayList<Integer> arrayList = new ArrayList();
        while(num>0){
            arrayList.add(num%10);
            num =num/10;
        }
        for(int x : arrayList){
            num+=x;
        }
        return num<10?num:addDigits(num);
    }
}

