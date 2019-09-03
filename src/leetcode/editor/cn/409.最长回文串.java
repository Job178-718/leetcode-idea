import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */
class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hashmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(hashmap.containsKey(c)){
                hashmap.put(c, hashmap.get(c)+1);
            }else{
                hashmap.put(c,1);
            }
        }
        int sum_len = 0;
        // for (Character key : hashmap.keySet()) {
        //     int len = hashmap.get(key)/2;
        //     hashmap.put(key,hashmap.get(key)-len*2);
        //     if(hashmap.get(key)==0){
        //         hashmap.remove(key);
        //     }
        //     sum_len+= len;
        // }
        Iterator<Map.Entry<Character,Integer>> entries = hashmap.entrySet().iterator();  
        while(entries.hasNext()){
            Map.Entry<Character,Integer> entry = entries.next();
            int len = entry.getValue()/2;
            hashmap.put(entry.getKey(),entry.getValue()-len*2);
            if(entry.getValue()==0){
                entries.remove();
            }
            sum_len+=len*2;
        }
        
        if(hashmap.size()!=0){
            return sum_len+1;
        }else{
            return sum_len;
        }
    }
}

