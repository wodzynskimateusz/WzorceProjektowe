package WzorzecFasada.KinoDomowe;

public class Wzmacniacz {

    boolean wlaczony;
    String zrodlo;
    int glosnosc;

    public void wlacz() {
        wlaczony = true;
    }

    public void wylacz() {
        wlaczony = false;
    }

    public void ustawZrodlo(String zrodlo) {
        this.zrodlo = zrodlo;
    }

    public void usatwGlosnosc(int glosnosc){
        this.glosnosc = glosnosc;
    }
}
