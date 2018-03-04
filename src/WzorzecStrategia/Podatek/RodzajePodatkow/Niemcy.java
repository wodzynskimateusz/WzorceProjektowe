package WzorzecStrategia.Podatek.RodzajePodatkow;

public class Niemcy implements PodatekInterfejs {
    @Override
    public double podatek(double input) {
        return input * 0.30;
    }
}
