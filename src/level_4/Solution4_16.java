package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_16 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        if(a<b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
