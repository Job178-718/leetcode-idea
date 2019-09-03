import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词模式
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        char[] chars = pattern.toCharArray();
        if (chars.length!=strs.length) return false;
        HashMap<Character,String> hashMap =new HashMap<>();
        for (int i = 0; i <chars.length; i++) {
            if(hashMap.containsKey(chars[i])){
                if(!hashMap.get(chars[i]).equals(strs[i])) return false;
            }else{
                if(!hashMap.containsValue(strs[i])){
                    hashMap.put(chars[i], strs[i]);
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}

