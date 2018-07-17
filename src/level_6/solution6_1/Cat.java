package level_6.solution6_1;

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize(){
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    protected void finalize(){
        System.out.println("Dog was destroyed");
    }
}

