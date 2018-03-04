package WzorzecObserwator.Szpital;

public class Ambulances implements Ambulance {

    protected Operator operator;
    static int number;
    int ourNumber;

    public Ambulances(Operator operator) {
        this.operator = operator;
        this.operator.registerObserver(this);
        ourNumber = number++;
    }


    @Override
    public void update(String accident) {
        System.out.println("Karetka " + (ourNumber + 1) + " :: jadę do: " + accident);
    }
}
