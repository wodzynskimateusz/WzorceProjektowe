package PracaDomowa.ZadanieBohaterDekorator.Swords;

public class MetalSword extends Sword {

    @Override
    public String getDescription() {
        return "Metalowy miecz";
    }

    @Override
    public int atack() {
        return 10;
    }
}
