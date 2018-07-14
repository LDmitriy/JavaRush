package level_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5_28 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a,b,c,d,e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a,int b,int c,int d,int e) {
        int[] mas = {a,b,c,d,e};
        for (int i = mas.length;i>0;i--){
            for (int k = 0; k<mas.length-1;k++){
                if(mas[k]<mas[k+1]){
                    int x=mas[k];
                    mas[k]=mas[k+1];
                    mas[k+1]=x;
                }
            }
        }
        return mas[mas.length-1];
    }
}
