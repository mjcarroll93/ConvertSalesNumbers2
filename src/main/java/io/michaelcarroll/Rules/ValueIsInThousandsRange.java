package io.michaelcarroll.Rules;

import io.michaelcarroll.SalesStringConverterUtil;

public class ValueIsInThousandsRange implements Rules{

    public boolean condition(int number) {
        return number > 999 && number < 1000000;
    }

    public String conversionToEnglishWord(int number){
        return SalesStringConverterUtil.convertInThousandsRange(number);
    }
}
