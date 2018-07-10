package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_30 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int n = Integer.parseInt(reader.readLine());
        int i = 0;

        while (i<n){
            System.out.println(name);
            i++;
        }
    }
}
