package WzorzecFasada.Ubrania;

import WzorzecFasada.Ubrania.Stroje.*;

public class UbraniaDemo {
    public static void main(String[] args) {

        Gloves gloves = new Gloves();
        Hat hat = new Hat();
        Scarf scarf = new Scarf();
        Shorts shorts = new Shorts();
        Sunglasses sunglasses = new Sunglasses();
        TShirt tShirt = new TShirt();

        FasadaLato lato = new FasadaLato(shorts, sunglasses, tShirt);
        FasadaZima zima = new FasadaZima(gloves, hat, scarf);

        System.out.println("ZIMA");
        System.out.println("****");
        zima.ubierzStrojZiomowy();
        System.out.println("-------------------");
        System.out.println("LATO");
        System.out.println("****");
        zima.zdejmijStrojZimowy();
        System.out.println("------");
        lato.ubierzStrojLetni();

    }
}
