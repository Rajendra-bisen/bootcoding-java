public class CycleApplication {
    public static void main(String[] args) {
        Cycle c1 = Cycle.CreateCycle();
        Cycle c2 = Cycle.CreateCycle(2, "Areo", "Disc", "Carbon Fiber", "Red", "10kg", "Hero");
        Cycle.printCycle(c1);
        System.out.println("-----------------------------------------2nd Brand Cycle-----------------------------------------");
        Cycle.printCycle(c2);
    }
}
