package io.michaelcarroll;


import io.michaelcarroll.Rules.*;
import java.util.ArrayList;
import java.util.List;

public class SalesStringConverterUtil {

    private static String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tensPlaces = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    private static List<Rules> conversionRules;

    public static String runConverterUtil(int parsedSalesString) {
        String salesMadeConvertedToWords = "";
        conversionRules = new ArrayList<>();
        conversionRules.add(new ValueIsBelowTwentyRule());
        conversionRules.add(new ValueIsAboveNineteenAndBelowOneHundredRule());
        conversionRules.add(new ValueIsInHundredsRangeRule());
        conversionRules.add(new ValueIsInThousandsRange());
        conversionRules.add(new ValueIsInMillionsRange());
        for (Rules rule : conversionRules) {
            if (rule.condition(parsedSalesString)) {
                salesMadeConvertedToWords = rule.conversionToEnglishWord(parsedSalesString);
                break;
            }
        }
        return salesMadeConvertedToWords;
    }

    public static String convertInMillionRange(int parsedSalesString){
        String millionsToString = "";
        int millionsPosition = parsedSalesString / 1000000;
        millionsToString += runConverterUtil(millionsPosition) + "Million";
        millionsToString += runConverterUtil(parsedSalesString - millionsPosition * 1000000);
        return millionsToString;
    }

    public static String convertInThousandsRange(int parsedSalesString) {
        String thousandsToString = "";
        int thousandsPosition = parsedSalesString / 1000;
        thousandsToString += runConverterUtil(thousandsPosition) + "Thousand";
        thousandsToString += runConverterUtil(parsedSalesString - thousandsPosition * 1000);
        return thousandsToString;
    }

    public static String convertInHundredsRange(int parsedSalesString) {
        int hundredsPosition = parsedSalesString / 100;
        return belowTwenty[hundredsPosition] + "Hundred" + runConverterUtil(parsedSalesString - hundredsPosition * 100);
    }

    public static String convertAboveNineteenAndBelowTwenty(int parsedSalesString) {
        return tensPlaces[parsedSalesString / 10] + belowTwenty[parsedSalesString % 10];
    }

    public static String convertBelowTwenty(int parsedSalesString) {
        return belowTwenty[parsedSalesString];
    }

}
