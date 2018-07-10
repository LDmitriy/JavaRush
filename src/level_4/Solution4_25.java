package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_25 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        if (a>0&a<1000){
            if (a>99){
                if (a%2==0){
                    System.out.println("четное трехзначное число");
                } else System.out.println("нечетное трехзначное число");
            } else {
                if (a>9){
                    if (a%2==0){
                        System.out.println("четное двузначное число");
                    } else System.out.println("нечетное двузначное число");
                } else {
                    if (a%2==0){
                        System.out.println("четное однозначное число");
                    } else System.out.println("нечетное однозначное число");
                }
            }
        }
    }
}
