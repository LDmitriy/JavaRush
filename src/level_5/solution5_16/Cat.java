package level_5.solution5_16;

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

    public Cat(String name) {
        this.name = name;
        this.weight = 1;
        this.age = 1;
        this.color = "Red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Red";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }

    public static void main(String[] args) {

    }
}
