package level_0;

public class Solution0_7 {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
