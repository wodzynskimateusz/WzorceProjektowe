package PracaDomowa.Zadanie3Adapter;

public class DolceGustoToTassimoAdapter implements Tassimo {

    DolceGusto dolceGusto;

    public DolceGustoToTassimoAdapter(DolceGusto dolceGusto){
        this.dolceGusto = dolceGusto;
    }

    @Override
    public void tassimo() {
        dolceGusto.dolceGusto();
    }
}
