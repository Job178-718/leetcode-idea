/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        char[] charlist = s.toLowerCase().toCharArray();
        int i = 0, j = charlist.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(charlist[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(charlist[j])) {
                j--;
                continue;
            }
            if (charlist[i++] != charlist[j--]) {
                return false;
            }
        }
        return true;
    }
}
