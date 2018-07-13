package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_39 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        mid(x,y,z);
    }

    public static void mid (int a, int b, int c){
        int[] mas = {a,b,c};
        for (int j = 0; j < 2; j++) {
            for (int i=0;i<2;i++){
                if (mas[i]>mas[i+1]){
                    int x = mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=x;
                }
            }
        }
        System.out.println(mas[1]);
    }
}
