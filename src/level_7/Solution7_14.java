package level_7;

import java.util.ArrayList;
import java.util.Collections;

public class Solution7_14 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        list.add(1, "именно");
        list.add(3, "именно");
        list.add(5, "именно");
        for (String x : list) {
            System.out.println(x);
        }
    }
}
