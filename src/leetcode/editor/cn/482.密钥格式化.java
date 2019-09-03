/*
 * @lc app=leetcode.cn id=482 lang=java
 *
 * [482] 密钥格式化
 */
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s_remove = S.replace("-","").toUpperCase();
        int remainder = s_remove.length()%K;
        String head = s_remove.substring(0, remainder);
        String last = s_remove.substring(remainder);
        StringBuffer stringBuffer = new StringBuffer();
        if(last.length()==0){
            return head;
        }
        if(head.length()!=0){
            head +='-';
        }
        for(int i = 0; i < last.length();i++) {
            stringBuffer.append(last.charAt(i));
            if((i+1)%K==0&&i+1<last.length()){
                stringBuffer.append('-');
            }
        }
        return head+stringBuffer.toString();
    }
}

