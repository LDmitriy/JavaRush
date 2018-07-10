package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_23 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        wea(a,b);
    }
    public static void wea (int a, int b){
        if (a!=0 & b!=0){
            if (a<0){
                if (b<0){
                    System.out.println("3");
                } else System.out.println("2");
            } else {
                if (b<0){
                    System.out.println("4");
                } else System.out.println("1");
            }
        }
    }
}
