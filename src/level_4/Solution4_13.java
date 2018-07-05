package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution4_13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String x = reader.readLine();
        int a = Integer.parseInt(x);

        String y = reader.readLine();
        int b = Integer.parseInt(y);

        String z = reader.readLine();
        int c = Integer.parseInt(z);

        testTriangle(a, b, c);

    }

    public static void testTriangle(int a, int b, int c) {
        int[] mas = {a, b, c};
        for (int i = 0; i < 2; i++) {
            if (mas[i] > mas[i + 1]) {
                int x = mas[i + 1];
                mas[i + 1] = mas[i];
                mas[i] = x;
            }
        }
        if (mas[2] < mas[0] + mas[1]) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}
