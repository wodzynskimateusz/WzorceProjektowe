package PracaDomowa.ZadanieBohaterDekorator.Shields;

public class WoodenShield extends Shield {

    @Override
    public String getDescription() {
        return "Drewniana tarcza";
    }

    @Override
    public int defence() {
        return 20;
    }
}
