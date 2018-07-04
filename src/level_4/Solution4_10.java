package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        int iX = Integer.parseInt(x);
        if (iX < 0) {
            iX++;
            System.out.println(iX);
        } else {
            if (iX > 0) {
                iX = iX * 2;
                System.out.println(iX);
            } else {
                System.out.println(0);
            }
        }
    }
}

