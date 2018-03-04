package WzorzecFasada.Ubrania.Stroje;

public class Hat implements Cloth {
    @Override
    public void ubierzSie() {
        System.out.println("Założyłem czapkę");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąłem czapkę");
    }

}
