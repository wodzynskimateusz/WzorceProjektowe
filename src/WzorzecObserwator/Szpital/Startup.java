package WzorzecObserwator.Szpital;

public class Startup {

    public static void main(String[] args) {
        OperatorAdam operatorAdam = new OperatorAdam();
        Ambulances firstAmbulance = new Ambulances(operatorAdam);
        Ambulances secondAmbulance = new Ambulances(operatorAdam);
        Ambulances thirdAmbulance = new Ambulances((operatorAdam));

        operatorAdam.notifyObserver("Wypadek samochodowy");
        operatorAdam.notifyObserver("Omdlenie");
        operatorAdam.notifyObserver("Złamanie kości");
    }
}
