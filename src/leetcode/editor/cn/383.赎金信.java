import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char [] m = magazine.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(char c :m){
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)+1);
            }else{
                hashMap.put(c,1);
            }
        }
        char [] r = ransomNote.toCharArray();
        for (char c : r) {
            if(hashMap.containsKey(c)){
                hashMap.put(c,hashMap.get(c)-1);
                if(hashMap.get(c)==0){
                    hashMap.remove(c);
                }
            }else{
                return false;
            }            
        }
        return true;
    }
}

