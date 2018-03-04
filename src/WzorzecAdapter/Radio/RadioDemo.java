package WzorzecAdapter.Radio;

public class RadioDemo {
    public static void main(String[] args) {

        RadioFM radioFM = new RadioFM(24);

        DigitalSignal udawaneRadioCyfrowe = new AnalogToDigitalAdapter(radioFM);
        udawaneRadioCyfrowe.printDigit();

    }
}
