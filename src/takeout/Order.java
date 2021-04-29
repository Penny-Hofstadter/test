package takeout;

import takeout.utils.PrintUtils;

import static takeout.utils.PrintUtils.CommonPrintMethods.print;
import static takeout.utils.PrintUtils.CommonPrintMethods.printLine;

public class Order {
    
    private String clientName;
    private int orderNumber;
    private int orderStatus;
    private MainDish mainDishChoice;
    private Side sideChoice;
    private Drink drinkChoice;
    private double tips;
    private double totalPrice;

    private static int staticCount = 0;
    private int dynamicCount = 0;
    private static int operations = 0;

    public Order(String clientName) {
        this.clientName = clientName;
        this.orderNumber = ++ staticCount;
        this.orderStatus = dynamicCount++;
        operations++;

    }
    public void cancelOrder(){
       this.orderStatus = dynamicCount--;
       operations++;

    }
    public void SetStatusActive() {
        if (dynamicCount == 0) {
            dynamicCount++;
        } operations++;
    }

    public void printOrder() {
        operations++;
        printLine();

        print("Order# " + orderNumber);
        print("       Client Name: " + clientName);
        print("       Order Status: " + dynamicCount);
        print("       Operations: " + operations);
        printLine();
    }



}
