/*
 * @lc app=leetcode.cn id=374 lang=java
 *
 * [374] 猜数字大小
 */
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=1;
        int mid=0;
        while(i<=n){
            mid = i+(n-i)/2;
            if(guess(mid)==-1){//mid值比pick大，因此要在左半边查找
                i=0;
                n=mid-1;
            }if(guess(mid)==1){//mid值比pick值小，在右半边找
                i=mid+1;
            }if(guess(mid)==0){//mid值与pick值相等
                break;
            }
        }
        return mid;
    }
}
