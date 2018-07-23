package level_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution6_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Cat catGrandfather = new Cat(reader.readLine());
        Cat catGrandmother = new Cat(reader.readLine());
        Cat catFather = new Cat(reader.readLine(),null,catGrandfather);
        Cat catMother = new Cat(reader.readLine(),catGrandmother,null);
        Cat catSon = new Cat(reader.readLine(),catMother,catFather);
        Cat catDaughter = new Cat(reader.readLine(),catMother,catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.father=father;
            this.mother=mother;
        }

        @Override
        public String toString() {
            if (father == null&&mother==null) {
                return "Cat name is " + name + ", no mother, no father";
            } else{
                if (mother==null){
                    return "Cat name is " + name + ", no mother " + ", father is " + father.name;
                } else {
                    if (father==null){
                        return "Cat name is " + name +", mother is " + mother.name + ", no father";
                    } else return "Cat name is " + name +", mother is " + mother.name + ", father is " + father.name;
                }
            }
        }
    }
}
