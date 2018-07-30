package level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution7_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        maximum = array[0];
        minimum = array[0];

        for (int i = 0; i < 20; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
