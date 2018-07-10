package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String sAge = reader.readLine();
        int iAge = Integer.parseInt(sAge);

        if (iAge>20) System.out.println("И 18-ти достаточно");
    }
}
