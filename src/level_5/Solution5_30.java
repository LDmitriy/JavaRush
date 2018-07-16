package level_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5_30 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        for (; ; ) {
            String i = reader.readLine();
            if (i.equals("сумма")) {
                System.out.println(sum);
                break;
            } else {
                sum += Integer.parseInt(i);
            }
        }
    }
}
