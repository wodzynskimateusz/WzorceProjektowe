package WzorzecObserwatorWbudowany.StacjaPogodowa.Wyswietlacze;

import WzorzecObserwatorWbudowany.StacjaPogodowa.DanePogodowe;
import WzorzecObserwatorWbudowany.StacjaPogodowa.WyswietlElement;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements Observer, WyswietlElement {
    private Observable danePogodowe;
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public WarunkiBiezace (Observable danePogodowe){
        this.danePogodowe = danePogodowe;
        this.danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietlElement() {
        System.out.printf("Temp: %.2f :: Ciśnienie: %.2f :: Wilgotność: %.2f\n",temp,cisnienie,wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe){
            DanePogodowe dp = (DanePogodowe) o;
            temp = dp.getTemp();
            cisnienie = dp.getCisnienie();
            wilgotnosc = dp.getWilgotnosc();
        }
    }
}
