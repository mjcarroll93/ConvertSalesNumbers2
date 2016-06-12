package io.michaelcarroll;

public class UserInputHandler {

    private ConvertSalesDigitsToEnglishWithCurrency convertSalesNumbers = new ConvertSalesDigitsToEnglishWithCurrency();

    public String startDigitToEnglishWordSalesConverter(String input) {
        if (inputForDigitToEnglishWordSalesConverterIsAStringOfPositiveIntegersBelowOneBillionWithoutCommasOrAnyCharacters(input))
            return convertSalesNumbers.addSalesCurrencyAfterConverterUtilIsRan(input);
        else
            return "Sorry the number entered is either above one billion or not valid";
    }

    private boolean inputForDigitToEnglishWordSalesConverterIsAStringOfPositiveIntegersBelowOneBillionWithoutCommasOrAnyCharacters(String input){
        return input.matches("\\d{1,9}");
    }
}
