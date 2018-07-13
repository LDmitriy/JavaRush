package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_38 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        for (int i=0;i<10;i++) System.out.println(name+" любит меня.");
    }
}
