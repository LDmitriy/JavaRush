package level_2;

public class Solution2_17 {
    public static void print3(String s) {
        int i = 0;
        do{
            System.out.print(s+" ");
            i++;
        }
        while(i<3);

    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
