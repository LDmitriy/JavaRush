package level_5.solution5_2;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.strength+this.age+this.weight>anotherCat.strength+anotherCat.age+anotherCat.weight){
            return true;
        } else return false;
    }

    public static void main(String[] args) {

    }
}
