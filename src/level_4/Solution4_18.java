package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_18 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        sort(a,b,c);
    }

    public static void sort (int a, int b, int c){
        int[] m = {a,b,c};
        for (int i = 0; i<2;i++){
            for (int j = 0; j<2;j++){
                if (m[j]>m[j+1]){
                    int x = m[j];
                    m[j] = m[j+1];
                    m[j+1] = x;
                }
            }
        }
        System.out.println(m[2]+" "+m[1]+" "+m[0]);
    }
}
