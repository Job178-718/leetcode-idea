/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */
class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        int sqrt = (int)Math.sqrt(area);
        if(Math.pow((int)Math.sqrt(area), 2)==area){
            result[0]=sqrt;
            result[1] =sqrt;
        }else{
            result[0]=area;
            result[1] =1;
            for (int i = area; i >sqrt; i--) {
                int l = i;
                int w = area/i;
                if(w*l==area&&l<result[0]){
                    result[0] =l;
                    result[1] =w;
                }
            }
        }
        return result;
    }
}

