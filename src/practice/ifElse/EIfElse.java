package practice.ifElse;

public class EIfElse {
    public static void main(String[] args) {
        int n;
        n = 0;

        if (n > 0) {
            if (n % 2 == 0) {
                if (n % 4 == 0) {
                    if (n > 4 ) {
                        System.out.println("your number is 8");
                    } else {
                        System.out.println("your number is 4");
                    }
                } else {
                    if (n % 3 == 0) {
                        System.out.println("your number is 6");
                    } else if (n < 5) {
                        System.out.println("your number is 2");
                    } else {
                        System.out.println("your number is 10");
                    }
                }
            } else {
                if (n % 3 == 0) {
                    if (n > 5) {
                        System.out.println("your number is 9");
                    } else {
                        System.out.println("your number is 3");
                    }

                } else {
                    if (n < 2) {
                        System.out.println("your number is 1");
                    } else if (n > 5) {
                        System.out.println("your number is 7");
                    } else {
                        System.out.println("your number is 5");
                    }
                }
            }

        } else {
            System.out.println("your number is 0");
        }
    }
}

