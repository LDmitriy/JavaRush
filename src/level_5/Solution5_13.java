package level_5;

public class Solution5_13 {
    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Vasy", 25);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
