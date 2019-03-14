package com.lv.ee;

import java.util.*;

/**
 * Created by 14zr on 2019-03-14.
 */
public class ArrayMapTest {
     public static void main(String args[]){
//        //arrayList
//         arrayListTest();
//         // map
//         Map();
//         //linkedList
         linkedList();

     }
    public static void arrayListTest() {
        // arrayList
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("lv1");
        a1.add("lv2");
        a1.add("lv1");
        for (String name: a1){
            System.out.println(name);
        }
        System.out.println("----------------");
        Iterator<String> iterators = a1.iterator();
        while (iterators.hasNext()) {
            System.out.println(iterators.next());
        }
        System.out.println(a1.get(2));
    }
    public static void Map() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("ÂÀÁÉ", 1);
        hashMap.put("ÂÀÁÉ2", 2);
        System.out.println(hashMap.get("ÂÀÁÉ"));
        Set<String> hashSet =  hashMap.keySet();
        for (String nameValue: hashSet) {
            System.out.println(hashMap.get(nameValue));
        }
    }
    public static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("lv1");
        linkedList.add("lv2");
        linkedList.add("lv4");
        linkedList.addFirst("1111");
        System.out.println(linkedList.getFirst());
    }
}
