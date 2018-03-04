package WzorzecAdapter.Radio;

public class AnalogToDigitalAdapter implements DigitalSignal {

    AnalogSignal radioFM;

    public AnalogToDigitalAdapter(AnalogSignal analogSignal) {
        radioFM = analogSignal;
    }

    @Override
    public int[] getDigit() {

        int[] digitArray = new int[radioFM.getAnalog().length / 8];

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < digitArray.length; i++) {
            for (int j = 0; j < 8; j++) {
                if (radioFM.getAnalog()[counter] > 1)
                    sum += (int) Math.pow(2, j);
                counter++;
            }
            digitArray[i] = sum;
            sum = 0;
        }

        return digitArray;
    }

    @Override
    public void setDigit(int[] digit) {
    }

    @Override
    public void printDigit() {
        int[] digits = getDigit();
        for (int i : digits) {
            System.out.printf("%d ", i);
        }
    }
}
