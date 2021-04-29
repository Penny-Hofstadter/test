package practice.myWhile;

public class While {
    public static void main(String[] args) {
        String s = "Sunday";

        while (s == "Saturday" || s == "Sunday") {
            System.out.println("sleep");
            break;
        }
        while (s == "Monday" || s == "Tuesday" || s == "Wednesday" || s =="Thursday" || s == "Friday") {
            System.out.println("work");
            break;
        }
    }
}
