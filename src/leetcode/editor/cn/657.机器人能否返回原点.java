/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int [] result = new int[]{0,0};
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'R':result[0]+=1;break;
                case 'L':result[0]-=1;break;
                case 'U':result[1]+=1;break;
                case 'D':result[1]-=1;break;
                default:break;
            }
        }
        return result[0]==0 &&result[1]==0;
    }
}

