package level_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6_21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }

        for (int i=0;i<mas.length;i++){
            for(int n=mas.length-1;n>i;n--){
                if (mas[n]<mas[n-1]){
                    int x = mas[n];
                    mas[n]=mas[n-1];
                    mas[n-1]=x;
                }
            }
        }

        for (int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
    }
}
