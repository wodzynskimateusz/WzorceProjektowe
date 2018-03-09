package PracaDomowa.ZadanieBohaterDekorator.Shields.ShieldAccessories;

import PracaDomowa.ZadanieBohaterDekorator.Shields.Shield;

public class Armour extends ShieldBonuses {

    Shield shield;

    public Armour (Shield shield){
        this.shield = shield;
    }

    @Override
    public String getDescription() {
        return shield.getDescription() + " + pancerz";
    }

    @Override
    public int defence() {
        return shield.defence() + 20;
    }
}
