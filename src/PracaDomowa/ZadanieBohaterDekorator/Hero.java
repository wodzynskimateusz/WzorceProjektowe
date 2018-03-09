package PracaDomowa.ZadanieBohaterDekorator;

import PracaDomowa.ZadanieBohaterDekorator.Packs.Pack;
import PracaDomowa.ZadanieBohaterDekorator.Shields.Shield;
import PracaDomowa.ZadanieBohaterDekorator.Swords.Sword;

public class Hero {

    private String name;
    private Shield shield;
    private Sword sword;
    private Pack pack;


    public Hero(String name, Shield shield, Sword sword, Pack pack) {
        this.name = name;
        this.shield = shield;
        this.sword = sword;
        this.pack = pack;
    }

    public void heroDescription(){
        System.out.printf("Bohater %s :: %s (obrona: %d) :: %s (atak: %d) :: %s (pojemność: %d)",
                name, shield.getDescription(), shield.defence(), sword.getDescription(), sword.atack(),
                pack.getDescription(), pack.capacity());
    }

}
