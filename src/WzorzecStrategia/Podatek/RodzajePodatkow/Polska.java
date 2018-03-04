package WzorzecStrategia.Podatek.RodzajePodatkow;

public class Polska  implements PodatekInterfejs {
    @Override
    public double podatek(double input) {
        return input * 0.23;
    }
}
