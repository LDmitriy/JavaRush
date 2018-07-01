package level_3;

public class Solution3_25 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x = (number%10)+(((number%100)-(number%10))/10)+(((number-(number%100)))/100);
        return x;
    }
}
