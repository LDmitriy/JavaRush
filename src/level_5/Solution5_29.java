package level_5;

public class Solution5_29 {
    public static void main(String[] args) {
        Man man = new Man("Man", 33, "address");
        Man man2 = new Man("Man2", 22, "address2");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        Woman woman = new Woman("Woman", 25, "address");
        Woman woman2 = new Woman("Woman2", 50, "address2");
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
