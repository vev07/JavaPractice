package Lesson2203;

import java.util.Scanner;

public class ExtraTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 13;



        System.out.println(reversString(binaryMethod(num)));
    }
    public static String binaryMethod(int num) {
        String binary = "";


        while (num != 0) {
            if(num == 0) {
                System.out.println("You enter zero");
                break;
            } else {
                int y = num % 2;
               binary += "" + y;

               num = (num / 2);
            }

        }return binary;

    }public static String reversString(String binary) {
        String reversBinary = "";
        for (int i = binary.length()-1; i >= 0 ; i--) {

           reversBinary += binary.charAt(i);
        }
     return reversBinary;
    }

}
