package level_3;

public class Solution3_2 {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(5,1.5));
        System.out.println(convertEurToUsd(10, 2.1));
    }

    public static double convertEurToUsd(int eur, double course) {
        double x = eur*course;
        return x;
    }
}
