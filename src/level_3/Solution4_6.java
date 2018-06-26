package level_3;

public class Solution4_6 {
    public static void main(String[] args) {
        Zerg zerg = new Zerg();
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();

        Protoss protoss = new Protoss();
        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();

        Terran terran = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
