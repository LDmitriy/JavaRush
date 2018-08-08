package level_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution8_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] array = s.toCharArray();
        s = s.substring(0, 1).toUpperCase() + s.substring(1);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                s = s.substring(0, i) + s.substring(i, i + 1).toUpperCase() + s.substring(i + 1);
            }
        }

        System.out.println(s);

    }
}
