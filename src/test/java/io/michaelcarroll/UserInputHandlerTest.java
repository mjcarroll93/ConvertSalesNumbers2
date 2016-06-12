package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserInputHandlerTest {

    UserInputHandler userInputHandler;

    @Before
    public void setup() {
        userInputHandler = new UserInputHandler();
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidString() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("dfdasfADS");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidNegativeNumber() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("-235");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidWithProperAmountOfDigitsButAnExtraCharacter() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("999999999a");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidSpecialCharacter() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("***");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidSpaces() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("  ");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidCommaSeparated() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("1,000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidDollarSign() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("$1000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidOneBillion() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("1000000000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidOne() throws Exception {
        String expectedValue = "OneDollar";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("1");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidNineteen() throws Exception {
        String expectedValue = "NineteenDollars";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("19");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidOneMillion() throws Exception {
        String expectedValue = "OneMillionDollars";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("1000000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidOneHundredMillion() throws Exception {
        String expectedValue = "OneHundredMillionDollars";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("100000000");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithValidNineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine() throws Exception {
        String expectedValue = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNineDollars";
        String actualValue = userInputHandler.startDigitToEnglishWordSalesConverter("999999999");
        assertEquals(expectedValue, actualValue);
    }
}