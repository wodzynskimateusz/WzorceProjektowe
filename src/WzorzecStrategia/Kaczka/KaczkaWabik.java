package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.NieKwacz;
import WzorzecStrategia.Kaczka.SposobyLatania.NieLatam;

public class KaczkaWabik extends Kaczka {

    public KaczkaWabik() {
        kwakanieInterfejs = new NieKwacz();
        latanieInterfejs = new NieLatam();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam kaczkę wabik");
    }

}
