package level_8;

import java.util.HashMap;

public class Solution8_14 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("dhg", "gghj");
        map.put("dghj", "gghj");
        map.put("jhsd", "gghj");
        map.put("shju", "gghj");
        map.put("uy", "gghj");
        map.put("fkuio", "gghj");
        map.put("fjddhg", "gghj");
        map.put("ftd", "gghj");
        map.put("fj", "gghj");
        map.put("rm,", "gghj");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (HashMap.Entry<String, String> s: map.entrySet()){
            if (s.getValue().equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (HashMap.Entry<String, String> s: map.entrySet()){
            if (s.getKey().equals(lastName)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
    }
}
