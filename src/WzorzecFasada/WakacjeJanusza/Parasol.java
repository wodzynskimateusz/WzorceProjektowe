package WzorzecFasada.WakacjeJanusza;

public class Parasol {

    boolean otwarty;

    public void rozloz(){
        otwarty = true;
        System.out.println("Rozłożyłem parasol");
    }

    public void zloz(){
        otwarty = false;
        System.out.println("Złożyłem/złamałem parasol");
    }
}
