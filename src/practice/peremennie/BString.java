package practice.peremennie;

import java.util.Locale;

public class BString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = " world!";

        System.out.println(String.join(a, b));
        System.out.println((a + b).toLowerCase());
        System.out.println(a + b);
        System.out.println((a+b).toUpperCase());
        System.out.println((a + b).equals(a));
        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
    }
}
