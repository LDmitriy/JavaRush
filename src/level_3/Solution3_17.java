package level_3;
import java.io.*;
public class Solution3_17 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите срок:");
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        System.out.println("Ведите имя:");
        String name = reader.readLine();
        System.out.println(name+" захватит мир через "+age+" лет. Му-ха-ха!");
    }
}
