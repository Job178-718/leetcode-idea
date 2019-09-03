import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char i :c){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if(map.get(c[i])==1){
                return i;
            }
        }
        return -1;
    }
}

