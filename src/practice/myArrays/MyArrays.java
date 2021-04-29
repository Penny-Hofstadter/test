package practice.myArrays;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

        //  String[] catsNames = new String[] {"Murka", "Murzik", "Ryzhik"} ;

        String[] catsNames = new String[8];

        catsNames[0] = "Murzik";
        catsNames[1] = "Chernish";
        catsNames[2] = "Murka";
        catsNames[3] = "Barsik";
        catsNames[4] = "Ryzhik";
        catsNames[5] = "Ashley";
        catsNames[6] = "Jina";
        catsNames[7] = "Mashka";

//        for (int boxNumber = 0; boxNumber < catsNames.length; boxNumber++) {
//            System.out.print(catsNames[boxNumber] + " " + boxNumber + " ");
//        }

        int[] catsAges = {2, 3, 4, 1, 5, 6, 9, 10};
        int min = 100;

         for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
             if (catsAges[boxNumber] < min) {
                 min = catsAges[boxNumber];
             }
         }
        System.out.println(min + " min");
         int max = 0;
         for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
             if (catsAges[boxNumber] > max) {
                 max = catsAges[boxNumber];
             }
         }
        System.out.println(max + " max");

         int result = 0;
         for (int boxNumber = 0; boxNumber< catsAges.length; boxNumber++) {
             result = result + catsAges[boxNumber];
         }
        System.out.println(result/8 + " average age ");


         String[] catsColors = new String[8];

         catsColors[0] = "Grey";
         catsColors[1] = "Black";
         catsColors[2] = "Grey";
         catsColors[3] = "Brown";
         catsColors[4] = "Red";
         catsColors[5] = "Grey";
         catsColors[6] = "Red";
         catsColors[7] = "Grey";

         String[] catsAgesString = new String[8];
        for (int boxNumber = 0; boxNumber < catsAges.length; boxNumber++) {
            catsAgesString[boxNumber] = String.valueOf(catsAges[boxNumber]);
            System.out.println(catsAgesString[boxNumber]);
        }
        System.out.println(catsAgesString[0].getClass());
        if (catsAgesString[0].equals(catsAges[0])){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        String numberString = "1";
        int number = 1;

        int numberInt = Integer.parseInt(numberString);
        System.out.println(numberInt + "                     numberInt");
        System.out.println(number + "                        number");

        if (number == numberInt) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        int[] catsAgesInt = new int[8];
        for (int i = 0; i < catsAgesString.length; i++){
            catsAgesInt[i] = Integer.parseInt(catsAgesString[i]);
            System.out.println(catsAgesInt[i] + " catsAgesInt[i]");
        }



        String[][] cats = new String[3][8];
        for (int row =0; row < 3; row++){
            for (int cell = 0; cell <  8; cell++){
                if (row == 0) {
                    cats[row][cell] = catsNames[cell];
                } else if (row == 1) {
                    cats[row][cell] = catsAgesString[cell];
                } else if (row == 2) {
                    cats[row][cell] = catsColors[cell];
                }
                System.out.println(cats[row][cell]);
            }
        }
        System.out.println();



    }
}
