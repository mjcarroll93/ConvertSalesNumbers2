package io.michaelcarroll.Rules;

import io.michaelcarroll.SalesStringConverterUtil;

/**
 * Created by michaelcarroll on 6/12/16.
 */
public class ValueIsBelowTwentyRule implements Rules {

    public boolean condition(int number) {
        return number < 20;
    }

    public String conversionToEnglishWord(int number){
        return SalesStringConverterUtil.convertBelowTwenty(number);
    }
}
