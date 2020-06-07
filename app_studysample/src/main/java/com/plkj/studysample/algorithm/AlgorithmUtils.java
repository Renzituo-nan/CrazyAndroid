package com.plkj.studysample.algorithm;


import com.plkj.studysample.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Renzituo
 * on 2020-05-21
 */
public class AlgorithmUtils {

    /**
     * 在一个数组中查找出两数之和等于目标和的两个数，并返回它们的下标
     * @param array 数组
     * @param target 目标和
     * @return
     */
    public static int[] function (int[] array, int target) {
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

    /**
     * 对HashMap的数据进行排序
     * @param hashMap
     * @return
     */
    public static HashMap<Integer, Person> sortPerson(HashMap<Integer,Person> hashMap){
        Set<Map.Entry<Integer, Person>> entries = hashMap.entrySet();
        ArrayList<Map.Entry<Integer, Person>> list = new ArrayList<>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Person>>() {
            @Override
            public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                return o1.getValue().age-o2.getValue().age;
            }
        });
        LinkedHashMap<Integer, Person> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Person> entry:list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
