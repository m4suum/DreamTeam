public class Main {
    public static void main(String[] args) {
        Fruits fruit = new Fruits(0, null, "black", "africa", 0);
        Orange orange = new Orange(1.5, "Orange", "оранжевый", "Africa", 200, 7, 3, "Verna");
        Banana banana = new Banana(2, "Banana", "желтый", "Africa", 120, 30, false, true);
        Grapes grapes = new Grapes(1.0, "Grapes", "фиолетовый", "Israel", 500, 70, false);
        System.out.println(orange + "\n" + banana + "\n" + grapes);
        orange.buyOrange();
        System.out.println();
        banana.buyBanana();
        System.out.println();
        grapes.buyGrapes();
        System.out.println();
        orange.eatOrange();
        System.out.println();
        banana.eatBanana();
        System.out.println();
        grapes.eatGrapes();
    }
}