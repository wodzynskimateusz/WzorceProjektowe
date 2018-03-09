package PracaDomowa.Zadanie2Dekorator;

public class DrinkDemo {
    public static void main(String[] args) {

        Spirit spirit = new Spirit();
        Water water1 = new Water(spirit);
        Water water2 = new Water(water1);
        Lemon lemon = new Lemon(water2);
        Blueberry blueberry = new Blueberry(lemon);
        Cherry cherry = new Cherry(blueberry);
        Water water3 = new Water(cherry);

        System.out.println(water3.getDescription());
        System.out.println(water3.alcohol() + " %");

    }
}
