import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 */
class Solution {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String> list = new ArrayList<>();
        for(int h=0;h<12;h++){
            int hnums = getonenums(h);
            for(int m =0;m<60;m++){
                if((getonenums(m)+hnums)==num){
                    if(m>=10){
                        list.add(String.format("%d:%d",h,m));
                    }else{
                        list.add(String.format("%d:0%d",h,m));
                    }
                }
            }
        }
        return list;
    }
    public int getonenums(int n){
        int count = 0;
        for(;n>0;count++){
            n &=(n-1);
        }
        return count;
    }
}

