package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution7_15 {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("роза");
        list.add("меа");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> s = new ArrayList<>();
        for (String x : list) {
            if (x.contains("р") && x.contains("л")) {
                s.add(x);
                continue;
            }
            if (x.contains("р")) {
                continue;
            }
            if (x.contains("л")) {
                s.add(x);
                s.add(x);
                continue;
            } else s.add(x);

        }
        return s;
    }
}
