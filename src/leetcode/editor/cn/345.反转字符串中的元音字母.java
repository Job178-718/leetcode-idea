import java.util.HashSet;
import java.util.Arrays;
/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */
class Solution {
    
    public String reverseVowels(String s) {
        Set<Character> vowSet =  new HashSet<Character>();
        vowSet.add('a');
        vowSet.add('e');
        vowSet.add('i');
        vowSet.add('o');
        vowSet.add('u');
        vowSet.add('A');
        vowSet.add('E');
        vowSet.add('I');
        vowSet.add('O');
        vowSet.add('U');
        char[] c = s.toCharArray();
        int i =0,j=c.length-1;
        while(i<j){
            if(!vowSet.contains(c[i])){
                i++;
            }
            if(!vowSet.contains(c[j])){
                j--;
            }
            if(vowSet.contains(c[j])&&vowSet.contains(c[i])){
                exchange(c, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(c);
    }
    public void exchange(char[] s, int i ,int j){
        char tmp;
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}

