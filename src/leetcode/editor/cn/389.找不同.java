import java.util.Iterator;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */
class Solution {
    public char findTheDifference(String s, String t) {
        char [] chs_s = s.toCharArray();
        char [] chs_t = t.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c :chs_s){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else{
                hashMap.put(c,1);
            }
        }

        for (char c : chs_t) {
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)-1);
                if(hashMap.get(c)==0){
                    hashMap.remove(c);
                }
            }else{
                return c;
            }   
        }
        return ' ';
    }
}

