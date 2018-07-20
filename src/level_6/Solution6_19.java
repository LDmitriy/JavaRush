package level_6;

public class Solution6_19 {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        public String getDescription() {
            return "!";
        }

    }

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
}
