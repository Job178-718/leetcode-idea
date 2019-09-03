/*
 * @lc app=leetcode.cn id=443 lang=java
 *
 * [443] 压缩字符串
 */
class Solution {
    public int compress(char[] chars) {
        int index=0;
        if(chars.length<2){
            return 1;
        }
        for(int i=0;i<chars.length;){
            int count=1;
            chars[index]=chars[i];
            index++;
            i++;
            while(i<chars.length&&chars[i] == chars[i-1]){
                count++;
                i++;
            }
            if(count>1){
                char[] newChar = String.valueOf(count).toCharArray();
                for(int j=0;j<newChar.length;j++){
                    chars[index]=newChar[j];
                    index++;
                }
            }
        }
        return index;
    }
}

