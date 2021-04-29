package practice.pesenka;

import org.w3c.dom.ls.LSOutput;

public class PpesenkaMethods {
    public static void main(String[] args) {
        System.out.println( "LYRICS");
        System.out.println(" ");

        String bottlesOfBeer = " bottles of beer";


        for (int beerBotCount = 99; beerBotCount >= 0; beerBotCount--) {
            if (beerBotCount == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.print("Go to the store and buy some more, ");
                //beerBotCount = 99;
                System.out.println(beerBotCount + "  bottles of beer on the wall.");
                //break;
            } else
            if (beerBotCount == 1){
                System.out.println(beerBotCount + " bottle of beer on the wall, " + beerBotCount + " bottle of beer. ");
                printTakeOneDown();
                // System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println("no more bottles of beer on the wall.");
                System.out.println();
                //continue;

            } else
            if (beerBotCount == 2){
                System.out.println(beerBotCount + " bottles of beer on the wall, " + beerBotCount + " bottles of beer. ");
                printTakeOneDown();
                System.out.println( (beerBotCount - 1) + " bottle of beer on the wall.");
                System.out.println();
                //continue;
            }
            printInt(beerBotCount);
            System.out.println(" bottles of beer on the wall, " + beerBotCount + " bottles of beer. ");
            System.out.println("Take one down and pass it around, " + (beerBotCount - 1) );
            printString(bottlesOfBeer);
            //System.out.println(".");
            printDot();
            System.out.println(" ");


        }
    }

    private static void printTakeOneDown() {
        System.out.print("Take one down and pass it around, ");
    }
    private static void printString(String string){
        System.out.println(string);
    }
    private static void printDot() {
        System.out.println(".");
    }
    private static void printInt(int number){
        System.out.println(number);
    }

}
