package WzorzecFasada.WakacjeJanusza;

public class Dolek {

    boolean wykopany;

    public void wykop(){
        wykopany = true;
        System.out.println("Wykopałem dołek");
    }

    public void zasyp(){
        wykopany = false;
        System.out.println("Zasypałem dołek");
    }
}
