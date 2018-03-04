package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.Kwacz;
import WzorzecStrategia.Kaczka.SposobyLatania.LatamBoMamSkrzydla;

public class PlaskonosKaczka extends Kaczka {

    public PlaskonosKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam płaskonos kaczkę");
    }

}
