package WzorzecFasada.Ubrania.Stroje;

public class Shorts implements Cloth {

    @Override
    public void ubierzSie() {
        System.out.println("Założyłem spodenki");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąłem spodenki");
    }

}
