package PracaDomowa.ZadanieBohaterDekorator.Shields.ShieldAccessories;

import PracaDomowa.ZadanieBohaterDekorator.Shields.Shield;

public class Spines extends ShieldBonuses {

    Shield shield;

    public Spines (Shield shield){
        this.shield = shield;
    }

    @Override
    public String getDescription() {
        return shield.getDescription() + " + kolce";
    }

    @Override
    public int defence() {
        return shield.defence() + 10;
    }
}
