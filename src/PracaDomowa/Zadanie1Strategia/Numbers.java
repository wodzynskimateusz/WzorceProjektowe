package PracaDomowa.Zadanie1Strategia;

import PracaDomowa.Zadanie1Strategia.NumbersTypes.INumbers;

public class Numbers {

    private INumbers iNumbers;

    public Numbers (INumbers iNumbers){
        setiNumbers(iNumbers);
    }

    public void setiNumbers (INumbers iNumbers){
        this.iNumbers=iNumbers;
    }

    public void generateNumbers(int limit){
        iNumbers.getNumbers(limit);
    }
}
