package WzorzecFasada.Ubrania.Stroje;

public class TShirt implements Cloth {
    @Override
    public void ubierzSie() {
        System.out.println("Założyłem koszulkę");
    }

    @Override
    public void rozbierzSie() {
        System.out.println("Zdjąlem koszulkę");
    }

}
