public class Duster {
    String size;
    String material;
    String shape;
    String color;
    boolean flexibility;
    public static Duster CreateDuster(){
        Duster duster = new Duster();
        duster.size = "7 inch";
        duster.material = "plastic";
        duster.shape = "recatangle";
        duster.color = "Black";
        duster.flexibility = true;
        return duster;

    }
    public static Duster CreateDuster(String s, String m, String S, String c, boolean f){
       Duster duster = new Duster();
        duster.size = s;
        duster.material =m;
        duster.shape = S;
        duster.color = c;
        duster.flexibility = f;
        return duster;
    }
    public static void printDuster(Duster duster){
        System.out.println("Duster size :-"+duster.size);
        System.out.println("Duster material :-"+duster.material);
        System.out.println("Duster shape :-"+duster.shape);
        System.out.println("Duster color :-"+duster.color);
        System.out.println("Duster flexibility :-"+duster.flexibility);

    }


}
