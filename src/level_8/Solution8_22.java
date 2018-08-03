package level_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution8_22 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int n = array.length - 1; n > i; n--) {
                int x;
                if (array[n] > array[n - 1]) {
                    x = array[n - 1];
                    array[n - 1] = array[n];
                    array[n] = x;
                }
            }
        }
    }
}
