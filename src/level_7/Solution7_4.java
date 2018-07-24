package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_4 {
    public static void main(String[] args) throws Exception {
        int[] mas1 = new int[20];
        int[] mas2 = new int[10];
        int[] mas3 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mas1[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            mas2[i] = mas1[i];
        }

        for (int i = 10; i < 20; i++) {
            mas3[i - 10] = mas1[i];
            System.out.println(mas3[i - 10]);
        }
    }
}
