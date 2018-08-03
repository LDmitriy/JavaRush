package level_8;

public class Solution8_21 {
    public static int A = 5; //тут статика не было
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public int getValue() {  // тут статик был
        return D;
    }

    public int getValue2() {
        return C;
    }
}
