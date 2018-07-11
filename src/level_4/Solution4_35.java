package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_35 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        for (int i=0;i<x;i++){
            for (int k=0;k<y;k++){
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
