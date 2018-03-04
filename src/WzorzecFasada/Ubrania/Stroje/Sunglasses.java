package WzorzecFasada.Ubrania.Stroje;

public class Sunglasses implements Cloth {
    @Override
    public void ubierzSie() {
        System.out.println("Założyłem okulary przeciwsłoneczne");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąłem okulary przeciwsłoneczne");
    }

}
