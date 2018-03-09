package PracaDomowa.ZadanieBohaterDekorator.Swords.SwordAccessories;

import PracaDomowa.ZadanieBohaterDekorator.Swords.Sword;

public class Fire extends SwordBonuses {

    Sword sword;

    public Fire (Sword sword){
        this.sword = sword;
    }

    @Override
    public String getDescription() {
        return sword.getDescription() + " + moc ognia";
    }

    @Override
    public int atack() {
        return sword.atack() + 10;
    }
}
