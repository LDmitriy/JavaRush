package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_0 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[10];

        for (int i = 0; i < 10; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 9; i > -1; i--) {
            System.out.println(mas[i]);
        }
    }
}
