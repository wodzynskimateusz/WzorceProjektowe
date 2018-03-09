package PracaDomowa.ZadanieBohaterDekorator.Swords.SwordAccessories;

import PracaDomowa.ZadanieBohaterDekorator.Swords.Sword;

public class Magic extends SwordBonuses {

    Sword sword;

    public Magic(Sword sword) {
        this.sword = sword;
    }

    @Override
    public String getDescription() {
        return sword.getDescription() + " + magiczne moce";
    }

    @Override
    public int atack() {
        return sword.atack() + 15;
    }
}
