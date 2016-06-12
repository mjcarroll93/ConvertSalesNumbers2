package io.michaelcarroll.Rules;


public class ValueIsOne implements SpecialCases {

    @Override
    public boolean condition(int parsedSalesString) {
        return parsedSalesString ==1;
    }

    @Override
    public String conversionToEnglishWord() {
        return "OneDollar";
    }
}
