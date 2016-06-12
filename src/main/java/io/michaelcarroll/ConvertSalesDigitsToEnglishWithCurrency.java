package io.michaelcarroll;

import io.michaelcarroll.Rules.SpecialCases;
import io.michaelcarroll.Rules.ValueIsOne;
import io.michaelcarroll.Rules.ValueIsZero;

import java.util.ArrayList;
import java.util.List;

public class ConvertSalesDigitsToEnglishWithCurrency {

    List<SpecialCases> specialCasesList;
    private String currency = "Dollars";

    public ConvertSalesDigitsToEnglishWithCurrency() {
        specialCasesList = new ArrayList<>();
        specialCasesList.add(new ValueIsOne());
        specialCasesList.add(new ValueIsZero());
    }

    public String addSalesCurrencyAfterConverterUtilIsRan(String originalSalesStringAsDigits) {

        int parsedSalesString = Integer.parseInt(originalSalesStringAsDigits);
        /*
        Handle cases for input being either Zero or One and return ZeroDollars or OneDollar immediately.  To change currency
        navigate to The Rules package and then to the class ValueIsOne or ValueIsZero
        */
        for (SpecialCases rule : specialCasesList) {
            if (rule.condition(parsedSalesString)) {
                return rule.conversionToEnglishWord();
            }
        }
        /*
        If there are no special cases then run the converter util to convert all other positive integer cases below one billion
         */
        return SalesStringConverterUtil.runConverterUtil(parsedSalesString) + currency;
    }
}
