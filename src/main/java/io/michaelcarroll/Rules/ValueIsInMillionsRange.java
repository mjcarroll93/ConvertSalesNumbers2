package io.michaelcarroll.Rules;


import io.michaelcarroll.SalesStringConverterUtil;

public class ValueIsInMillionsRange implements Rules{

    public boolean condition(int number) {
        return number > 999999 && number < 999999999;
    }

    public String conversionToEnglishWord(int number){
        return SalesStringConverterUtil.convertInMillionRange(number);
    }
}
