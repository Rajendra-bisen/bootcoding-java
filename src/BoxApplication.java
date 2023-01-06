public class BoxApplication {
    public static void main(String[] args) {
        Box b1 = Box.CreateBox();
        Box b2 = Box.CreateBox(7.5,2.5,5.5);
        Box.printBox(b1);
        Box.printBox(b2);
    }
}
