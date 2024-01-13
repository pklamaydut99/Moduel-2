package hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a",30);
        hashMap.put("e",31);
        hashMap.put("b",29);
        hashMap.put("d",28);
        hashMap.put("c",27);
        System.out.println("hien thi");
        System.out.println(hashMap+"\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("hien thi theo thu tu tang dan");
        System.out.println(treeMap+"\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("a",30);
        linkedHashMap.put("e",31);
        linkedHashMap.put("b",29);
        linkedHashMap.put("d",28);
        linkedHashMap.put("q",27);
        System.out.println("\n tuoi cua "+"a la"+linkedHashMap.get("a"));
    }
}
