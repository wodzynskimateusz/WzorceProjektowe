package PracaDomowa.ZadanieBohaterDekorator.Packs.PackAccessories;

import PracaDomowa.ZadanieBohaterDekorator.Packs.Pack;

public class Increase extends PackBonuses {

    Pack pack;

    public Increase(Pack pack) {
        this.pack = pack;
    }

    @Override
    public String getDescription() {
        return pack.getDescription() + " + powiększenie";
    }

    @Override
    public int capacity() {
        return pack.capacity() + 1;
    }
}
