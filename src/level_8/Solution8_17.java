package level_8;

import java.util.HashMap;

public class Solution8_17 {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("q",45);
        map.put("w",2656);
        map.put("e",45);
        map.put("r",437569);
        map.put("t",45);
        map.put("y",7546);
        map.put("u",45);
        map.put("i",33357);
        map.put("o",4638);
        map.put("p",45);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String,Integer> copy = new HashMap<>(map);
        for (HashMap.Entry<String,Integer> s: copy.entrySet()){
            if (s.getValue()<500){
                map.remove(s.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String,Integer> map = createMap();
//        for (HashMap.Entry<String,Integer> s: map.entrySet()){
//            System.out.println(s.getKey()+" "+s.getValue());
//        }
//        System.out.println();
//        removeItemFromMap(map);
//        for (HashMap.Entry<String,Integer> s: map.entrySet()){
//            System.out.println(s.getKey()+" "+s.getValue());
//        }
    }
}
