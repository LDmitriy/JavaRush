package level_2;

public class Solution2_15 {
    public static int min(int a, int b, int c) {
        int x;
        if (a<b){
            if (a<c){
                x=a;
            } else{
                x=c;
            }
        } else {
            if(b<c){
                x=b;
            } else {
                x=c;
            }
        }
        return x;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
