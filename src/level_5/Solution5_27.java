package level_5;

public class Solution5_27 {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tonCat = new Cat("Tom",50,15);

        Dog dog = new Dog("Dog",70,20);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name,int height,int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name,int height,int tail){
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
