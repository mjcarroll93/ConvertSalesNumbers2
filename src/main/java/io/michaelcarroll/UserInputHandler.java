package io.michaelcarroll;

public class UserInputHandler {

    private ConvertSalesDigitsToEnglishWithCurrency convertSalesNumbers = new ConvertSalesDigitsToEnglishWithCurrency();

    public String runDigitToEnglishWordSalesConverter(String input) {
        if (input.matches("\\d+"))
            return convertSalesNumbers.addSalesCurrencyAfterConverterUtilIsRan(input);
        else
            return "Sorry the number entered is either above one billion or not valid";
    }

}
