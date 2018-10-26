package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "2");
        map.put("3", "4");
        map.put("5", "6");

        for (String key : map.keySet()) {
            System.out.println("key:" + key +  ",value:"+ map.get(key));
        }
        System.out.println("----------------------------");
        for (String val : map.values()) {
            System.out.println("value:" + val);
        }
        System.out.println("----------------------------");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println("----------------------------");
        Iterator<Map.Entry<String, String> > it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }

}
