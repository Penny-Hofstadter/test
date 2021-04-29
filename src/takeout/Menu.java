package takeout;

import static takeout.utils.PrintUtils.*;
import static takeout.utils.PrintUtils.CommonPrintMethods.*;
import static takeout.utils.PrintUtils.PrintSpaces.*;
import static takeout.utils.PrintUtils.PrintTitles.*;

public class Menu {
    final MainDish beef = new MainDish("Beef Wellington", 13.00 );
    final MainDish fish = new MainDish("Miso Salmon", 12.00);
    final MainDish chicken = new MainDish("Chicken teriyaki", 7.00);
    final MainDish pork = new MainDish("Honey Garlic Pork Chops", 10.00);

    Side rice = new Side("Brown rice", 2.99);
    Side asparagus = new Side("Asparagus", 4.50);
    Side beans = new Side("Green beans", 5.00);
    Side potato = new Side("Mashed potatoes", 4.00);

    Drink water = new Drink("Perrier", 3.50);
    Drink wineWhite = new Drink("Chardonnay", 20.50);
    Drink wineRed = new Drink("Merlot", 40.00);
    Drink juiceApple = new Drink("Fresh Apple juice", 10.00);

    MainDish[] mainDishes = new MainDish[] {beef, fish, chicken, pork};
    Side[] sides = new Side[] {rice, asparagus, beans, potato};
    Drink[] drinks = new Drink[] {water, wineWhite, wineRed, juiceApple};

    public MainDish getBeef() {
        return beef;
    }


    public MainDish getFish() {
        return fish;
    }


    public MainDish getChicken() {
        return chicken;
    }


    public MainDish getPork() {
        return pork;
    }


    public Side getRice() {
        return rice;
    }

    public void setRice(Side rice) {
        this.rice = rice;
    }

    public Side getAsparagus() {
        return asparagus;
    }

    public void setAsparagus(Side asparagus) {
        this.asparagus = asparagus;
    }

    public Side getBeans() {
        return beans;
    }

    public void setBeans(Side beans) {
        this.beans = beans;
    }

    public Side getPotato() {
        return potato;
    }

    public void setPotato(Side potato) {
        this.potato = potato;
    }

    public Drink getWater() {
        return water;
    }

    public void setWater(Drink water) {
        this.water = water;
    }

    public Drink getWineWhite() {
        return wineWhite;
    }

    public void setWineWhite(Drink wineWhite) {
        this.wineWhite = wineWhite;
    }

    public Drink getWineRed() {
        return wineRed;
    }

    public void setWineRed(Drink wineRed) {
        this.wineRed = wineRed;
    }

    public Drink getJuiceApple() {
        return juiceApple;
    }

    public void setJuiceApple(Drink juiceApple) {
        this.juiceApple = juiceApple;
    }
    public String[] getMainDishesNames() {
        String[] mainDishesNames = new String[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i ++) {
            mainDishesNames[i] = mainDishes[i].getMainDishName();
        }
        return mainDishesNames;
    }
    public double[] getMainDishesPrices(){
        double[] mainDishesPrice = new double[mainDishes.length];
        for (int i = 0; i < mainDishes.length; i ++) {
            mainDishesPrice[i] = mainDishes[i].getMainDishPrice();
        }
        return mainDishesPrice;
    }
    public String[] getSidesNames(){
        String[] sidesNames = new String[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesNames[i] = sides[i].getSideName();
        }
        return sidesNames;
    }
    public double[] getSidesPrices() {
        double[] sidesPrices = new double[sides.length];
        for (int i = 0; i < sides.length; i ++) {
            sidesPrices[i] = sides[i].getSidePrice();
        }
        return sidesPrices;
    }
    public String[] getDrinksNames() {
        String[] drinksNames = new String[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksNames[i] = drinks[i].getDrinkName();
        }
        return drinksNames;
    }
    public double[] getDrinksPrices() {
        double[] drinksPrices = new double[drinks.length];
        for (int i = 0; i < drinks.length; i ++) {
            drinksPrices[i] = drinks[i].getDrinkPrice();
        }
        return drinksPrices;
    }
    double[] mainDishesPrices = getMainDishesPrices();
    private void printMainDishes(){
        printMainDishesTitle();
        for (int i = 0; i < getMainDishesNames().length; i++) {
            print(getMainDishesNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(),getDrinksNames(),getMainDishesNames()[i]));

            printPrice(mainDishesPrices[i]);
            println();
        }
        println();
    }
    private void printSides() {
        printSidesTitle();
        for (int i = 0; i < getSidesNames().length; i++) {
            print(getSidesNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(),getDrinksNames(),getSidesNames()[i]));

            printPrice(getSidesPrices()[i]);
            println();
        }
        println();
    }
    private void printDrinks() {
        printDrinksTitle();
        for (int i = 0; i < getDrinksNames().length; i++) {
            print(getDrinksNames()[i]);
            printSpacesAfterName(spacesAfterName(getMainDishesNames(), getSidesNames(),getDrinksNames(),getDrinksNames()[i]));

            printPrice(getDrinksPrices()[i]);
            println();
        }
        println();
    }
    public void printMenu(){
        printMenuTitle();
        printMainDishes();
        printSides();
        printDrinks();
        println();
        printLine();

    }

}
