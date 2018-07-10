package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_24 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        test(a);
    }

    public static void test (int a){
        if (a==0){
            System.out.println("ноль");
        } else {
            if (a<0){
                if (a%2==0){
                    System.out.println("отрицательное четное число");
                }else System.out.println("отрицательное нечетное число");
            }else {
                if (a%2==0){
                    System.out.println("положительное четное число");
                }else System.out.println("положительное нечетное число");
            }
        }
    }
}
