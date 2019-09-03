/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int len =2*numRows-2; 
        int [] a = new int [len];
        for(int i=0;i<numRows;i++){
            a[i] = i;
        }
        for(int j=1;j+numRows-1<len;j++){
            a[j+numRows-1]=a[numRows-1-j];
        }
        StringBuffer[] sbBuffers = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            sbBuffers[i] = new StringBuffer();
        }
        for(int i = 0;i<s.length();i++){
            int flag = a[i%len];
            sbBuffers[flag].append(s.charAt(i));
        }
        String result = "";
        for(StringBuffer ss:sbBuffers){
            result+=ss.toString();
        }
        return result;
    }
}

