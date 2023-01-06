public class Cycle {
    int numWheels;
    String handlebars;
    String brakes;
    String frame;
    String color;
    String  Weight;
    String  brand;

    public static Cycle CreateCycle(){
    Cycle cycle = new Cycle();
    cycle.numWheels = 2;
    cycle.handlebars = "Flat";
    cycle.brakes = "Rim";
    cycle.frame = "Steel";
    cycle.color = "Black";
    cycle.Weight ="12kg";
    cycle.brand ="Polo" ;
    return cycle;
}
public static Cycle CreateCycle(int w, String h, String b, String f, String c, String  W, String B){
    Cycle cycle = new Cycle();
    cycle.numWheels =w;
    cycle.handlebars = f;
    cycle.brakes = b;
    cycle.frame = f;
    cycle.color = c;
    cycle.Weight = W;
    cycle.brand = B;
    return cycle;
}
public static void printCycle(Cycle cycle){

    System.out.println("Number of Wheels :-"+cycle.numWheels);
    System.out.println("Type of Handlebars :-"+cycle.handlebars);
    System.out.println("Type of Brakes :-"+cycle.brakes);
    System.out.println("Type of frame :-"+cycle.frame);
    System.out.println("Weight :-"+cycle.Weight);
    System.out.println("Color :-"+cycle.color);
    System.out.println("Brand :-"+cycle.brand);
}
    }