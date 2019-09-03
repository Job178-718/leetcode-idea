/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution{
    public int myAtoi(String str){
        String test = str.trim();
        int a = 0;
        String result ="";
        Pattern pattern = Pattern.compile("^[-|\\+]?[\\d]+");
        Matcher matcher = pattern.matcher(test);
        if(matcher.find()){
            result = matcher.group();
            if(result.length()!=0){
                try{
                    a = Integer.parseInt(result);
                }catch(Exception e){
                    if(result.charAt(0)=='-'){
                        a = -2147483648;
                    }else{
                        a = 2147483647;
                    }
                }
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.myAtoi(str));
        sc.close();
    }
}

