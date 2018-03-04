package WzorzecStrategia.Kaczka;

import WzorzecStrategia.Kaczka.SposobyKwakania.NieKwacz;
import WzorzecStrategia.Kaczka.SposobyLatania.LatamBoMamSkrzydla;

public class KaczkaModel extends Kaczka {

    public KaczkaModel(){
        kwakanieInterfejs = new NieKwacz();
        latanieInterfejs = new LatamBoMamSkrzydla();
    }

    @Override
    public void wyswietl() {
        System.out.println("Wyświetlam kaczkę model");
    }
}
