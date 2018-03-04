package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.Kwacz;
import WzorzecStrategia.Kaczka.SposobyLatania.LatamBoMamSkrzydla;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam dziką kaczkę");
    }

}
