package WzorzecAdapter.KaczoIndyk;

public class KaczoIndykDemo {
    public static void main(String[] args) {

        DzikiIndyk indyk = new DzikiIndyk();

        Kaczka udawanaKaczka = new IndykAdapter(indyk);

        udawanaKaczka.kwacz();

    }
}
