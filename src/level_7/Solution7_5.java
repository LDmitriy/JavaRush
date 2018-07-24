package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_5 {
    public static void main(String[] args) throws Exception {
        int[] mas = new int[15];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        int count1 = 0, count2 = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                count1 += mas[i];
            } else {
                count2 += mas[i];
            }
        }

        if (count1 > count2) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
