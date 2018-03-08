package PracaDomowa.Zadanie1Strategia.NumbersTypes;

import PracaDomowa.Zadanie1Strategia.NumbersTypes.INumbers;

public class Odd implements INumbers {

    @Override
    public void getNumbers(int limit) {
        System.out.println("Liczby nieparzyste mniejsze od " + limit);
        for (int i = 0; i < limit; i++) {
            if (i % 2 != 0)
                System.out.printf("%d\t", i);
        }
    }
}
