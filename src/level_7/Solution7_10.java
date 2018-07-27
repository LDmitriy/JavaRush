package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution7_10 {
    private static List<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int max = strings.get(0).length();
        for (int i = 0; i < strings.size(); i++) {
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }
        }
    }
}
