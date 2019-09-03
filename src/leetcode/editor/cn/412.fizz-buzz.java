import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else{
                if(i%3==0||i%5==0){
                    if(i%3==0){
                        list.add("Fizz");
                    }else{
                        list.add("Buzz");
                    }
                }else{
                    list.add(String.valueOf(i));
                }
            }
        }
        return list;
    }
}

