package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_27 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        int sumPositive = 0, sumNegative = 0;

        if (a!=0){
            if (a>0){
                sumPositive++;
            } else sumNegative++;
        }

        if (b!=0){
            if (b>0){
                sumPositive++;
            } else sumNegative++;
        }

        if (c!=0){
            if (c>0){
                sumPositive++;
            } else sumNegative++;
        }

        System.out.println("количество отрицательных чисел: "+sumNegative+","+"количество положительных чисел: "+sumPositive);
    }
}
