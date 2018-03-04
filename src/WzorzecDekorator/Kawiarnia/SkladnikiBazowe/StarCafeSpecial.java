package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class StarCafeSpecial extends Napoj {

    @Override
    public String pobierzOpis() {
        return "Star Cafe Special";
    }

    @Override
    public double koszt() {
        return 10.00;
    }
}
