package io.michaelcarroll.Rules;

public class ValueIsZero implements SpecialCases{
    @Override
    public boolean condition(int parsedSalesString) {
        return parsedSalesString == 0;
    }

    @Override
    public String conversionToEnglishWord() {
        return "ZeroDollars";
    }
}
