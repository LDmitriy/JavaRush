package level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution7_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            num.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 9; i > -1; i--) {
            System.out.println(num.get(i));
        }
    }
}
