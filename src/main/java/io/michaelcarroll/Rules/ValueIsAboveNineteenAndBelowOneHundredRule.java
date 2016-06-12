package io.michaelcarroll.Rules;


import io.michaelcarroll.SalesStringConverterUtil;

public class ValueIsAboveNineteenAndBelowOneHundredRule implements Rules{

    public boolean condition(int number) {
        return number > 19 && number < 100;
    }

    public String conversionToEnglishWord(int number){
        return SalesStringConverterUtil.convertAboveNineteenAndBelowTwenty(number);
    }
}
