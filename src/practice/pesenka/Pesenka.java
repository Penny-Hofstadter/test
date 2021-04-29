package practice.pesenka;

public class Pesenka {

        public static void main(String[] args) {
            System.out.println( "LYRICS");
            System.out.println(" ");

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
                    System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                    System.out.println();
                    //continue;

                } else
                if (beerBotCount == 2){
                    System.out.println(beerBotCount + " bottles of beer on the wall, " + beerBotCount + " bottles of beer. ");
                    System.out.println("Take one down and pass it around, " + (beerBotCount - 1) + " bottle of beer on the wall.");
                    System.out.println();
                    //continue;
                }
                System.out.println(beerBotCount + " bottles of beer on the wall, " + beerBotCount + " bottles of beer. ");
                System.out.println("Take one down and pass it around, " + (beerBotCount - 1) + " bottles of beer on the wall.");
                System.out.println(" ");


            }
        }

    }




