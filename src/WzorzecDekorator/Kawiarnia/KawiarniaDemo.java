package WzorzecDekorator.Kawiarnia;

import WzorzecDekorator.Kawiarnia.Dodatki.BitaSmietana;
import WzorzecDekorator.Kawiarnia.Dodatki.Czekolada;
import WzorzecDekorator.Kawiarnia.Dodatki.Mleko;
import WzorzecDekorator.Kawiarnia.SkladnikiBazowe.Bezkofeinowa;

public class KawiarniaDemo {

    public static void main(String[] args) {

        Napoj bezkofeinowaZMlekiem = new BitaSmietana(new Mleko(new Bezkofeinowa()));
        bezkofeinowaZMlekiem = new Czekolada(bezkofeinowaZMlekiem);
        System.out.println(bezkofeinowaZMlekiem.pobierzOpis());
        System.out.println(bezkofeinowaZMlekiem.koszt());
    }
}
