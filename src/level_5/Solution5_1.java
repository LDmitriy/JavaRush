package level_5;

public class Solution5_1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska",5,4,10);
        Cat cat2 = new Cat("VtoroyVaska",1,2,2);
        Cat cat3 = new Cat("Mashka",2,2,3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
