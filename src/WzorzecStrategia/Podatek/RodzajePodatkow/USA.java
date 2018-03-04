package WzorzecStrategia.Podatek.RodzajePodatkow;

public class USA implements PodatekInterfejs {
    @Override
    public double podatek(double input) {
        return input * 0.15;
    }
}
