package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_22 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        hoo(a,b,c);
    }

    public static void hoo (int a, int b, int c){
        if (a!=b & a!=c & b!=c) {

        } else {
            if (a != b & a != c) {
                System.out.println("1");
            } else {
                if (b != a & b != c) {
                    System.out.println("2");
                } else System.out.println("3");
            }
        }
    }
}
