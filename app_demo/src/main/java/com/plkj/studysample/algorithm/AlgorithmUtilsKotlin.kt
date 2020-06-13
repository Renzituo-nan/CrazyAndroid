package com.plkj.studysample.algorithm

import com.plkj.studysample.Person
import java.util.*

/**
 *Created by Renzituo
 *on 2020-05-21
 */
object AlgorithmUtilsKotlin {
    fun sortPerson(hashMap: HashMap<Int, Person>): HashMap<Int, Person>? {
        val entries: Set<Map.Entry<Int, Person>> = hashMap.entries
        val list = ArrayList(entries)
        Collections.sort(list) { o1, o2 -> o1.value.age - o2.value.age }
        val linkedHashMap = LinkedHashMap<Int, Person>()
        for ((key, value) in list) {
            linkedHashMap[key] = value
        }
        return linkedHashMap
    }
}