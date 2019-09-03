package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=599 lang=java
 *
 * [599] 两个列表的最小索引总和
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        int min = list1.length + list2.length;
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            String key = list2[i];
            if (map1.containsKey(key)) {
                int index = map1.get(list2[i]) + i;
                min = Math.min(min,index);
                map2.put(key, index);
            }
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String key : map2.keySet()) {
            if(map2.get(key) == min){
                arrayList.add(key);
            }
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }
}
