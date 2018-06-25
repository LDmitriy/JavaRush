package level_2;

public class Solution2_7 {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(41));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        double TF =9/5.0*celsium+32;

        return TF;
    }
}
