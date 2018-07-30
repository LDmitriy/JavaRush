package level_7;

public class Solution7_23 {
    public static void main(String[] args) {
        Human ded1 = new Human("ded1Name", true, 60);
        Human ded2 = new Human("ded2Name", true, 61);
        Human babka1 = new Human("babka1Name", false, 50);
        Human babka2 = new Human("babka2Name", false, 51);
        Human father = new Human("fatherName", true, 30, ded1, babka1);
        Human mather = new Human("motherName", false, 25, ded2, babka2);
        Human dete1 = new Human("dete1Name", true, 6, father, mather);
        Human dete2 = new Human("dete2Name", true, 4, father, mather);
        Human dete3 = new Human("dete3Name", false, 2, father, mather);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
        System.out.println(father.toString());
        System.out.println(mather.toString());
        System.out.println(dete1.toString());
        System.out.println(dete2.toString());
        System.out.println(dete3.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
