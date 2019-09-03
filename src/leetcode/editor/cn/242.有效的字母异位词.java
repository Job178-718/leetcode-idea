import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        //转成数组
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        //排序
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }
}

