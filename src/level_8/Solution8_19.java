package level_8;

import java.util.HashMap;
import java.util.Map;

public class Solution8_19 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("q", "a");
        map.put("q", "s");
        map.put("w", "d");
        map.put("e", "d");
        map.put("r", "f");
        map.put("t", "g");
        map.put("y", "h");
        map.put("u", "j");
        map.put("i", "k");
        map.put("o", "l");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
