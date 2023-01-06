public class Box {
    double length;
    double breadth;
    double height;

    public static Box CreateBox() {
        Box box = new Box();
        box.length = 10.0;
        box.breadth = 10.0;
        box.height = 10.0;
        return box;

    }

    public static Box CreateBox(double l, double b, double h) {
        Box box = new Box();
        box.length = l;
        box.breadth = b;
        box.height = h;
        return box;
    }

    public static void printBox(Box box){
        System.out.println("Box Length =" + box.length);
        System.out.println("Box breadth =" + box.breadth);
        System.out.println("Box height =" + box.height);

    }


}