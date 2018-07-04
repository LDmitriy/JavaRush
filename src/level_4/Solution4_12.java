package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int y = Integer.parseInt(x);

        if (y>0){
            if (y>=400){
                if (y%400==0){
                    System.out.println("количество дней в году: 366");
                } else {
                    if (y%100==0){
                        System.out.println("количество дней в году: 365");
                    } else {
                        if (y%4==0){
                            System.out.println("количество дней в году: 366");
                        } else {
                            System.out.println("количество дней в году: 365");
                        }
                    }
                }
            } else {
                if (y%100==0){
                    System.out.println("количество дней в году: 365");
                } else {
                    if (y%4==0){
                        System.out.println("количество дней в году: 366");
                    } else {
                        System.out.println("количество дней в году: 365");
                    }
                }
            }
        } else {
            System.out.println("Введено недопустимое значение");
        }
    }
}
