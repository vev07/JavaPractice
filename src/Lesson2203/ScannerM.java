package Lesson2203;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String str = scanner.nextLine();
        boolean checkString = Pattern.matches("\\D*", str);

        while (checkString == false) {
            System.out.println("You enter some thing wrong");
            str = scanner.next();
            checkString = Pattern.matches("\\D*", str);
        }
        System.out.println("Enter your age");
        int x = scanner.nextInt();
        if(x > 8) {
            int age = x;
        } else {
            System.out.println("You are too young, try to enter your age");
            while (x <= 8) {
                x = scanner.nextInt();
            }
        }

        System.out.println("Enter your tall");
        double y = scanner.nextDouble();


        System.out.println("Enter your city");
        String str2 = scanner.next();
        boolean checkString2 = Pattern.matches("\\D*", str2);

        while (checkString2 == false) {
            System.out.println("You enter some thing wrong");
            str2 = scanner.next();
            checkString2 = Pattern.matches("\\D*", str2);
        }

        System.out.println(str+ " "+ x +" "+ y + " " + str2);

    }
}
