package level_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution7_26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
            listUpperCase.add(list.get(i));
            listUpperCase.add(list.get(i));
            if (list.get(i).length()%2!=0){
                listUpperCase.add(list.get(i));
            }
        }

        for (int i = 0; i < listUpperCase.size();) {
            String s = listUpperCase.get(i);
//            System.out.println(listUpperCase.get(i));
            if (s.length()%2!=0){
                System.out.print(s+" "+s+" "+s);
                i+=3;
            } else {
                System.out.print(s+" "+s);
                i+=2;
            }
            System.out.println();
        }
    }
}
