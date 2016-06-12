package io.michaelcarroll;


import java.util.Scanner;

public class Display {

    static Scanner scanner = new Scanner(System.in);

    public static void printMessage(String msg)
    {
        System.out.println(msg);
    }

    public static String promptUserForDigitsToConvert(){
        printMessage("Enter Sales Number to Convert to English Words: ");
        return scanner.next();
    }
}
