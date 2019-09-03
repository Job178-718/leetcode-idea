import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (true) {
            if(hashSet.contains(n)){
                return false;
            }else{
                hashSet.add(n);
                char[] charlist = String.valueOf(n).toCharArray();
                int sum = 0;
                for(char ch:charlist){
                    sum+=Integer.parseInt(ch+"")*Integer.parseInt(ch+"");
                }
                n = sum;
                if(n == 1){
                    return true;
                }

            }

        }
    }
}

