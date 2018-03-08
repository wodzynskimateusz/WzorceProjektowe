package PracaDomowa.Zadanie3Adapter;

public class CaffeeDemo {
    public static void main(String[] args) {

        DolceGustoCaffee dolceGusto = new DolceGustoCaffee();

        Tassimo udawaneTassimo = new DolceGustoToTassimoAdapter(dolceGusto);

        udawaneTassimo.tassimo();
    }
}
