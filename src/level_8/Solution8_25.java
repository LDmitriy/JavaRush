package level_8;

import java.util.ArrayList;

public class Solution8_25 {
    public static void main(String[] args) {
        Human child1 = new Human("Child1", true, 16);
        Human child2 = new Human("Child2", false, 13);
        Human child3 = new Human("Child3", true, 11);
        Human father = new Human("Father", true, 39);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);
        Human mather = new Human("Mather", false, 38);
        mather.children.add(child1);
        mather.children.add(child2);
        mather.children.add(child3);
        Human grandfather1 = new Human("Ded", true, 65);
        grandfather1.children.add(father);
        Human grandmother1 = new Human("Babka", false, 64);
        grandmother1.children.add(father);
        Human grandfather2 = new Human("Ded", true, 64);
        grandfather2.children.add(mather);
        Human grandmother2 = new Human("Babka", false, 63);
        grandmother2.children.add(mather);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
