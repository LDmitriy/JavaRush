package level_5.solution5_9;

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Red";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "Green";
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 1;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 1;
    }


    public static void main(String[] args) {

    }
}
