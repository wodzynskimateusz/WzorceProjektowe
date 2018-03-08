package PracaDomowa.Zadanie1Strategia;

import PracaDomowa.Zadanie1Strategia.NumbersTypes.Even;
import PracaDomowa.Zadanie1Strategia.NumbersTypes.Odd;

public class NumbersDemo {
    public static void main(String[] args) {

        Numbers numbers = new Numbers(new Even());
        numbers.generateNumbers(20);

        System.out.println();

        numbers.setiNumbers(new Odd());
        numbers.generateNumbers(20);
    }
}
