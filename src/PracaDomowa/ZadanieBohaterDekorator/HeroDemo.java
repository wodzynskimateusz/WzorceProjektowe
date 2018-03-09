package PracaDomowa.ZadanieBohaterDekorator;

import PracaDomowa.ZadanieBohaterDekorator.Packs.Pack;
import PracaDomowa.ZadanieBohaterDekorator.Packs.PackAccessories.Increase;
import PracaDomowa.ZadanieBohaterDekorator.Packs.StandardPack;
import PracaDomowa.ZadanieBohaterDekorator.Shields.Shield;
import PracaDomowa.ZadanieBohaterDekorator.Shields.ShieldAccessories.Armour;
import PracaDomowa.ZadanieBohaterDekorator.Shields.ShieldAccessories.Spines;
import PracaDomowa.ZadanieBohaterDekorator.Shields.WoodenShield;
import PracaDomowa.ZadanieBohaterDekorator.Swords.MetalSword;
import PracaDomowa.ZadanieBohaterDekorator.Swords.Sword;
import PracaDomowa.ZadanieBohaterDekorator.Swords.SwordAccessories.Fire;
import PracaDomowa.ZadanieBohaterDekorator.Swords.SwordAccessories.Magic;

public class HeroDemo {
    public static void main(String[] args) {

        Shield tarcza = new Spines(new Armour(new WoodenShield()));
        Sword miecz = new Fire(new Magic(new MetalSword()));
        Pack zasobnik = new Increase(new Increase(new StandardPack()));

        Hero bohater = new Hero("Mateusz", tarcza, miecz, zasobnik);

        bohater.heroDescription();





    }
}
