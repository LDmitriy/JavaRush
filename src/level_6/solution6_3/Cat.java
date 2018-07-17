package level_6.solution6_3;

public class Cat {
    public static int catCount = 0;

    Cat(){
        catCount++;
    }

    protected void finalize() throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}
