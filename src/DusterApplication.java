public class DusterApplication {
    public static void main(String[] args) {
        Duster d1 = Duster.CreateDuster();
        Duster d2 = Duster.CreateDuster("5inch","plastic","curved","blue",true);
        Duster.printDuster(d1);
        System.out.println("---------------------------Default Duster----------------------");
        Duster.printDuster(d2);

    }
}
