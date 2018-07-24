package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] mas = new String[10];

        for (int i = 0; i < 8; i++) {
            mas[i] = reader.readLine();
        }

        for (int i = 9; i > -1; i--) {
            System.out.println(mas[i]);
        }
    }
}
