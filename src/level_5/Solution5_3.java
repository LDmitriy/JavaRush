package level_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int n = 0;

        for (;;){
            int x = Integer.parseInt(reader.readLine());
            if (x==-1){
                System.out.println((double)count/n);
                break;
            }
            count+=x;
            n++;
        }
    }
}
