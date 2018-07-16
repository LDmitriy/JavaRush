package level_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5_31 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        int n = Integer.parseInt(reader.readLine());
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int k = 0; k < n - 1; k++) {
            if (mas[k] > mas[k + 1]) {
                int x = mas[k + 1];
                mas[k + 1] = mas[k];
                mas[k] = x;
            }
        }

        maximum = mas[n - 1];

        System.out.println(maximum);
    }
}
