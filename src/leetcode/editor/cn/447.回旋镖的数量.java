/*
 * @lc app=leetcode.cn id=447 lang=java
 *
 * [447] 回旋镖的数量
 */
class Solution {
    public int numberOfBoomerangs(int[][] points){
        int result = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(i == j) continue;
                int distance = getDistance(points[i],points[j]);
                map.put(distance, map.getOrDefault(distance,0)+1);
            }
            for(int val : map.values()){
                result += val*(val-1); //满足条件的点的排列组合结果数
            }
            map.clear();
        }
    
        return result;
    }
    
    public int getDistance(int[] point1, int[] point2){
        int x = point1[0] - point2[0];
        int y = point1[1] - point2[1];
        return x*x + y*y;
    }
}



