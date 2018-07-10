package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_26 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        int sum=0;
        if (a>0) sum++;

        if (b>0) sum++;

        if (c>0) sum++;
        System.out.println(sum);
    }
}
