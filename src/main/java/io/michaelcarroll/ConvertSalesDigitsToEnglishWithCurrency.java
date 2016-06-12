package io.michaelcarroll;

public class ConvertSalesDigitsToEnglishWithCurrency {

    private String currency = "Dollars";

    public String addSalesCurrencyAfterConverterUtilIsRan(String originalSalesStringAsDigits) {
        int parsedSalesString = Integer.parseInt(originalSalesStringAsDigits);

        return SalesStringConverterUtil.runConverterUtil(parsedSalesString) + currency;
    }
}
