package WzorzecFasada.Ubrania.Stroje;

public class Gloves implements Cloth {
    @Override
    public void ubierzSie () {
        System.out.println("Założyłem rękawiczki");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąłem rękawiczki");
    }

}
