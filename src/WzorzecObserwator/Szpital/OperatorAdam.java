package WzorzecObserwator.Szpital;

import java.util.ArrayList;

public class OperatorAdam implements Operator {

    private ArrayList<Ambulance> karetki = new ArrayList<>();

    @Override
    public void registerObserver(Ambulance ambulance) {
        karetki.add(ambulance);
    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        karetki.remove(ambulance);
    }

    @Override
    public void notifyObserver(String accident) {
        for (Ambulance ambulance : karetki) {
            ambulance.update(accident);
        }
    }
}
