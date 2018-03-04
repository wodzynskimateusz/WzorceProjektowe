package WzorzecFasada.Ubrania.Stroje;

public class Scarf implements Cloth {
    @Override
    public void ubierzSie() {
        System.out.println("Założylem szalik");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąłem szalik");
    }

}
