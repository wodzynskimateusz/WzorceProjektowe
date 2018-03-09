package PracaDomowa.Zadanie2Dekorator;

public class Cherry extends DrinkDecorator {

    Drink drink;

    public Cherry(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + sok wiśniowy";
    }

    @Override
    public int alcohol() {
        return drink.alcohol();
    }
}
