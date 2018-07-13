package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_40 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        for (;;){
            int x = Integer.parseInt(reader.readLine());
            count += x;
            if (x==-1){
                System.out.println(count);
                break;
            }
        }
    }
}
