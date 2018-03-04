package WzorzecAdapter.Radio;

public class DigitalRadio implements DigitalSignal {

    private int[] digit;

    public DigitalRadio(int signalLength) {
        digit = new int[signalLength];
    }

    @Override
    public int[] getDigit() {
        return digit;
    }

    @Override
    public void setDigit(int[] digit) {
       // nie ma mozliwosci zamiany sygnalu cyfrowego na analogowy
    }

    @Override
    public void printDigit() {
        int[]digits = getDigit();
        for (int i : digits) {
            System.out.printf("%d ", i);
        }
    }
}
