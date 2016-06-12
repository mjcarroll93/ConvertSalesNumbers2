package io.michaelcarroll;

public class App {

    public static void main(String[] args) {
        UserInputHandler userInputHandler = new UserInputHandler();
        userInputHandler.startDigitToEnglishWordSalesConverter(Display.promptUserForDigitsToConvert());
    }
}
