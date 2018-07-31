package level_8;

import java.util.HashSet;

public class Solution8_0 {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("женьшень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String s: set){
            System.out.println(s);
        }
    }
}
