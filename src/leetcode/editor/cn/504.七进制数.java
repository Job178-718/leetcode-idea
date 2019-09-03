/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
 */
class Solution {
    public String convertToBase7(int num) {
        if(num == 0 ){
            return ""+num;
        }
        boolean flag = num>=0?true:false;
        num = Math.abs(num);
        StringBuffer stringBuffer = new StringBuffer();
        while(num>0){
            stringBuffer.append(num%7);
            num = num/7;
        }
        return (flag?"":"-")+stringBuffer.reverse().toString();        
    }
}

