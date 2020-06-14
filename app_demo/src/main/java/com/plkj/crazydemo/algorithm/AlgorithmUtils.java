package com.plkj.crazydemo.algorithm;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Renzituo
 * on 2020-05-21
 */
public class AlgorithmUtils {

    public static void main(String[] args){

    }

    /**
     * 在一个数组中查找出两数之和等于目标和的两个数，并返回它们的下标
     * @param array 数组
     * @param target 目标和
     * @return
     */
    public static int[] getTheTwoNumAboutTargetFromTarget (int[] array, int target) {
        Map<Integer,Integer> map = new HashMap();
        for (int  i = 0; i < array.length; i++) {
            int diff = target - array[i];//7,2,0,-16
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(array[i], i);
        }
        return null;
    }
}
