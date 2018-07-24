package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_3 {
    public static void main(String[] args) throws Exception {
        String[] mas1 = new String[10];
        int[] mas2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            mas1[i] = reader.readLine();
        }

        for (int i = 0; i < 10; i++) {
            mas2[i] = mas1[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(mas2[i]);
        }
    }
}
