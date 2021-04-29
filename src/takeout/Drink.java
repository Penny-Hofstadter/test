package takeout;

public final class Drink {
    private final String drinkName;
    private final double drinkPrice;

    public Drink(String drinkName, double drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

}
