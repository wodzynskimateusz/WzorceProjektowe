package PracaDomowa.Zadanie2Dekorator;

public class Blueberry extends DrinkDecorator {

    Drink drink;

    public Blueberry(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " + sok jagodowy";
    }

    @Override
    public int alcohol() {
        return drink.alcohol();
    }
}
