package CoreJava;

import java.util.TreeMap;

public class TreeMapExample {

        public static void main(String[] args)
        {
            // Creating TreeMap
            TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
        //Adding value in treeMap
            treeMap.put("a",100);
            treeMap.put("b",200);
            treeMap.put("c",300);
            treeMap.put("d",400);
            // Displaying TreeMap
            System.out.println(treeMap);
        }
    }
