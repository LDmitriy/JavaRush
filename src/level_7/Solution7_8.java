package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution7_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).length() < list.get(i).length()) {
                min = list.get(i + 1).length();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
            }
        }
    }
}
