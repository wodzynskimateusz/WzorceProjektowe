package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.Piszcz;
import WzorzecStrategia.Kaczka.SposobyLatania.NieLatam;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka() {
        kwakanieInterfejs = new Piszcz();
        latanieInterfejs = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam gumową kaczkę");
    }

}
