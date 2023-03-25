package Homework1;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number  for byte");
        byte b = scanner.nextByte();

        System.out.println("Enter number  for short");
        short s = scanner.nextShort();

        System.out.println("Enter number  for int");
        int i = scanner.nextInt();

        System.out.println("Enter number  for Long");
        long l = scanner.nextLong();

        System.out.println("Enter number  for float");
        float f = scanner.nextFloat();

        System.out.println("Enter number  for double");
        double d = scanner.nextDouble();

        System.out.println("Enter char");
        char c = scanner.next().charAt(0);

        System.out.println("Enter string");
        String str = scanner.next();

        System.out.printf("%3d--- ,%3d--- ,%3d--- ,%3d--- ,%3f--- %n,%3f--- ,%3c--- ,--- 1%3s", b,s,i,l,f,d,c,str);



    }
}
