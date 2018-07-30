package level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution7_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        for (; ; ) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                list.add(s);
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
