package level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution7_1 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int[] initializeArray() throws IOException {
        int[] mas = new int[20];
        for (int i = 0; i < 20; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        return mas;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
