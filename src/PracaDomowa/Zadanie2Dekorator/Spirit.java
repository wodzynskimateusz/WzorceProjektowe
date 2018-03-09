package PracaDomowa.Zadanie2Dekorator;

public class Spirit extends Drink {

    @Override
    public String getDescription() {
        return "Spirytus";
    }

    @Override
    public int alcohol() {
        return 90;
    }
}
