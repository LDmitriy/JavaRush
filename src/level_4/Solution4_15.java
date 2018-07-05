package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        twain(a,b,c);
    }

    public static void twain (int a, int b, int c){
        if (a==b & b==c){
            System.out.println(a+" "+b+" "+c);
        } else {
            if (a==b){
                System.out.println(a+" "+b);
            } else {
                if (b==c){
                    System.out.println(b+" "+c);
                } else {
                    if (a==c){
                        System.out.println(a+" "+c);
                    }
                }
            }
        }
    }
}
