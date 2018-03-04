package WzorzecAdapter.Radio;

import java.util.Random;

public class RadioFM implements AnalogSignal {

    private double[] analog;

    public RadioFM (int noSample){
        analog = new double[noSample];
        Random rand = new Random();
        analog = rand.doubles(noSample,0,2.0).toArray();
    }


    @Override
    public double[] getAnalog() {
        return analog;
    }

    @Override
    public void setAnalog(double[] analog) {
        this.analog = analog;
    }

    @Override
    public void printAnalog() {
        for (Double i : analog) {
            System.out.printf("%f ", i);
        }
    }
}
