/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int reverse(int x) {
        if(x==0){
            return x;
        }
        boolean flag =(x>0)?true:false;
        x = (flag)?x:-x;
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer stringBuffer = new StringBuffer();
        while(x>0){
            queue.add(x%10);
            x = x/10;
        }
        while(queue.peek()!=null){
            stringBuffer.append(queue.poll());
        }
        int result = 0;
        try{
            result = Integer.parseInt(stringBuffer.toString());
        }catch(Exception e){
            return 0;
        }
        return (flag)?result:result*(-1);
    }
    public static void main(String[] args) {
        int x =1534236469;
        Solution su = new Solution();
        int y = su.reverse(x);
        System.out.println(y);
        
    }
}

