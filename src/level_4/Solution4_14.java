package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_14 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        double x = Double.parseDouble(a);

        liht(x);
    }

    public static void liht (double x){
        if (x<=5.0){
            if (x<3.0 | x==5){
                System.out.println("зелёный");
            } else {
                if (x<4.0){
                    System.out.println("жёлтый");
                } else System.out.println("красный");

            }
        } else {
            for (;x>5.0;x-=5.0);
            if (x<3.0 | x==5){
                System.out.println("зелёный");
            } else {
                if (x<4.0){
                    System.out.println("жёлтый");
                } else System.out.println("красный");
            }
        }
    }
}
