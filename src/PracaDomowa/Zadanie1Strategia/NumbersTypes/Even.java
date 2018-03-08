package PracaDomowa.Zadanie1Strategia.NumbersTypes;

public class Even implements INumbers {

    @Override
    public void getNumbers(int limit) {
        System.out.println("Liczby parzyste mniejsze od " + limit);
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0)
                System.out.printf("%d\t", i);
        }
    }
}
