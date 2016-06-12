package io.michaelcarroll.Rules;


import io.michaelcarroll.SalesStringConverterUtil;

public class ValueIsInHundredsRangeRule implements Rules{

    public boolean condition(int number) {
        return number > 99 && number < 1000;
    }

    public String conversionToEnglishWord(int number){
        return SalesStringConverterUtil.convertInHundredsRange(number);
    }
}
