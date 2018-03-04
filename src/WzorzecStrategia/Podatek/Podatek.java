package WzorzecStrategia.Podatek;

import WzorzecStrategia.Podatek.RodzajePodatkow.PodatekInterfejs;
import WzorzecStrategia.Podatek.RodzajePodatkow.Polska;

public class Podatek {
    protected PodatekInterfejs podatekInterfejs;

    public Podatek(){
        podatekInterfejs = new Polska();
    }

    public void setPodatek(PodatekInterfejs podatekInterfejs){
        this.podatekInterfejs = podatekInterfejs;
    }

    public void obliczPodatek(int input){
        System.out.println(podatekInterfejs.podatek(input));
    }
}
