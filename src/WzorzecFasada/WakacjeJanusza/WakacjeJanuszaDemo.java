package WzorzecFasada.WakacjeJanusza;

public class WakacjeJanuszaDemo {

    public static void main(String[] args) {

        Dolek dolek = new Dolek();
        Dom dom = new Dom();
        Grazyna grazyna = new Grazyna();
        Morze morze = new Morze();
        Parasol parasol = new Parasol();
        Parawan parawan = new Parawan();
        Piwo piwo = new Piwo();

        FasadaWakacjeJanusza wakacje = new FasadaWakacjeJanusza(dolek, dom, grazyna, morze, parasol, parawan, piwo);

        System.out.println("---ZACZYNAMY---");
        wakacje.rozpocznijPlazowanie();
        System.out.println();
        System.out.println("---KONCZYMY PLAŻING---");
        wakacje.zakonczPlazowanie();

    }
}
