package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertSalesNumbersToCurrencyTest {
    ConvertSalesDigitsToEnglishWithCurrency convertSalesNumbersToCurrency;

    @Before
    public void setUp() throws Exception {
        convertSalesNumbersToCurrency = new ConvertSalesDigitsToEnglishWithCurrency();
    }

    @Test
    public void convertSalesNumbersToStringPassingStringEighteen() throws Exception {
        String expectedValue = "EighteenDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("18");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void convertSalesNumbersToStringPassingStringOneHundredFiftyFive() throws Exception {
        String expectedValue = "OneHundredFiftyFiveDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("155");
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void convertSalesNumbersToStringPassingStringOneMillion() throws Exception {
        String expectedValue = "OneMillionDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("1000000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertSalesNumbersToStringPassingStringNineHundredNinetyNineThousandNineHundredNinetyNine() throws Exception {
        String expectedValue = "NineHundredNinetyNineThousandNineHundredNinetyNineDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("999999");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidNineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNineInput() throws Exception {
        String expectedValue = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNineDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("999999999");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void convertSalesNumbersToStringPassingStringZero() throws Exception {
        String expectedValue = "ZeroDollars";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("0");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertSalesNumbersToStringPassingStringOne() throws Exception {
        String expectedValue = "OneDollar";
        String actualValue = convertSalesNumbersToCurrency.addSalesCurrencyAfterConverterUtilIsRan("1");
        assertEquals(expectedValue, actualValue);
    }

}