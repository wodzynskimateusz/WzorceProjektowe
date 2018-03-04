package WzorzecFasada.WakacjeJanusza;

public class Parawan {

    boolean rozlozony;

    public void rozloz() {
        rozlozony = true;
        System.out.println("Rozlożyłem parawan");
    }

    public void zloz() {
        rozlozony = false;
        System.out.println("Złożyłem parawan");
    }
}
