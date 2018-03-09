package PracaDomowa.ZadanieBohaterDekorator.Packs;

public class StandardPack extends Pack {

    @Override
    public String getDescription() {
        return "Standardowy zasobnik";
    }

    @Override
    public int capacity() {
        return 5;
    }
}
