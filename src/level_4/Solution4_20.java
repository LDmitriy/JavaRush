package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String sAge = reader.readLine();
        int iAge = Integer.parseInt(sAge);

        if (iAge<18) System.out.println("Подрасти еще");
    }
}
