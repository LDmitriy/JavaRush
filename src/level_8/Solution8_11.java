package level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution8_11 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count1 = 1;
        int count2 = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).equals(list.get(i))) {
                count1++;
            } else {
                if (count1 > count2) {
                    count2 = count1;
                    count1 = 1;
                } else count1 = 1;
            }
        }

        System.out.println(count1 > count2 ? count1 : count2);

    }
}
