package WzorzecStrategia.Podatek.RodzajePodatkow;

public class Czechy implements PodatekInterfejs {
    @Override
    public double podatek(double input) {
        return input * 0.10;
    }
}
