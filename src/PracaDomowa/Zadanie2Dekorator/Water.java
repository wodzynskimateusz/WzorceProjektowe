package PracaDomowa.Zadanie2Dekorator;

public class Water extends DrinkDecorator {

    Drink drink;

    public Water(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + woda";
    }

    @Override
    public int alcohol() {
        return drink.alcohol() - 8;
    }
}
