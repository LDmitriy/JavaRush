package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_17 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x0 = reader.readLine();
        int a0 = Integer.parseInt(x0);

        String x1 = reader.readLine();
        int a1 = Integer.parseInt(x1);

        String x2 = reader.readLine();
        int a2 = Integer.parseInt(x2);

        String x3 = reader.readLine();
        int a3 = Integer.parseInt(x3);

        min(a0,a1,a2,a3);

    }

    public static void min (int a,int b,int c, int d){
        int[] m = {a,b,c,d};
        for(int i=0; i<3; i++){
            if (m[i]>m[i+1]){
                int x = m[i];
                m[i]=m[i+1];
                m[i+1]=x;
            }
        }
        System.out.println(m[3]);
    }
}
