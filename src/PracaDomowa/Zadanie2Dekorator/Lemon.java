package PracaDomowa.Zadanie2Dekorator;

public class Lemon extends DrinkDecorator {

    Drink drink;

    public Lemon(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + sok cytrynowy";
    }

    @Override
    public int alcohol() {
        return drink.alcohol();
    }
}
