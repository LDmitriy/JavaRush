package level_3;

public class Solution3_10 {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(1));
    }

    public static int convertToSeconds(int hour){
        int second = hour*60*60;
        return  second;
    }
}
