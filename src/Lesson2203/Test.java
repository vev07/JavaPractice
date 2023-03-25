package Lesson2203;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
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
            System.out.println(str);


    }
}
