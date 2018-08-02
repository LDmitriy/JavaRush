package level_8;

import java.util.HashMap;
import java.util.Map;

public class Solution8_16 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("q", "fff");
        map.put("w", "ffghff");
        map.put("e", "ffghff");
        map.put("r", "fffghf");
        map.put("t", "fff");
        map.put("y", "ffghff");
        map.put("u", "fff");
        map.put("i", "ffhf");
        map.put("o", "fff");
        map.put("p", "ffdhf");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashMap<String,String> clon = new HashMap<>(map);
        for (HashMap.Entry<String,String> s: clon.entrySet()){
            map.remove(s.getKey());
            if (map.containsValue(s.getValue())){
                removeItemFromMapByValue(map,s.getValue());
            } else {
                map.put(s.getKey(),s.getValue());
            }
        }


//        HashMap<String,String> clon = new HashMap<>(map);  // мое решение без использования лишнего метода
//        map.clear();
//        for (HashMap.Entry<String, String> s: clon.entrySet()){
//            if (map.containsValue(s.getValue())){
//                continue;
//            }
//            map.put(s.getKey(),s.getValue());
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();   //   код для проверки работоспособности программы
//        for (HashMap.Entry<String,String> s: map.entrySet()){
//            System.out.println(s.getKey()+" "+s.getValue());
//        }
//        removeTheFirstNameDuplicates(map);
//        System.out.println("-");
//        for (HashMap.Entry<String,String> s: map.entrySet()){
//            System.out.println(s.getKey()+" "+s.getValue());
//        }
    }
}
