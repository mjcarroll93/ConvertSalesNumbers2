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
    public void runDigitToEnglishWordSalesConverterWithNonValidStringInput() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.runDigitToEnglishWordSalesConverter("dfdasfADS");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidNegativeNumberInput() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.runDigitToEnglishWordSalesConverter("-235");
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void runDigitToEnglishWordSalesConverterWithNonValidSpacesInput() throws Exception {
        String expectedValue = "Sorry the number entered is either above one billion or not valid";
        String actualValue = userInputHandler.runDigitToEnglishWordSalesConverter("  ");
        assertEquals(expectedValue, actualValue);
    }

}