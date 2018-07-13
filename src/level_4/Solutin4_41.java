package level_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutin4_41 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int year = Integer.parseInt(reader.readLine());
        int month = Integer.parseInt(reader.readLine());
        int day = Integer.parseInt(reader.readLine());


        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+day+"."+month+"."+year);
    }
}
