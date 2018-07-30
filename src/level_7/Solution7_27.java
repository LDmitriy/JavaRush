package level_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution7_27 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int n = array.length-1; n > i; n--){
                if (array[n]>array[n-1]){
                    int x = array[n];
                    array[n] = array[n-1];
                    array[n-1] = x;
                }
            }
        }
    }
}
