/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */
class Solution {
    public String addStrings(String num1, String num2) {
        String result = "";
        int i=num1.length()-1,j=num2.length()-1;
        int carry =0;//进位
        while(i>=0||j>=0){
            if(i>=0&&j>=0){
                int sum = (int)num1.charAt(i--)-'0'+(int)num2.charAt(j--)-'0'+carry;
                carry=sum>9?1:0;
                result=sum%10+result;
            }else{
                if(j>=0){
                    int sum = (int)num2.charAt(j--)-'0'+carry;
                    carry=sum>9?1:0;
                    result=sum%10+result;
                }
                if(i>=0){
                    int sum = (int)num1.charAt(i--)-'0'+carry;
                    carry=sum>9?1:0;
                    result=sum%10+result;
                }
            }
        }
        if(carry!=0){
            result = carry+result;
        }
        return result;
    }
}

