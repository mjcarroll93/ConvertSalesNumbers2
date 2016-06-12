package io.michaelcarroll;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesStringConverterUtilTest {


    @Test
    public void convertBelowTwentyPassingArgumentEighteen() throws Exception {
        String expectedValue = "Eighteen";
        String actualValue = SalesStringConverterUtil.convertBelowTwenty(18);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertAboveNineteenBelowHundredsPassingArgumentTwenty() throws Exception {
        String expectedValue = "Twenty";
        String actualValue = SalesStringConverterUtil.convertAboveNineteenAndBelowTwenty(20);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertAboveNineteenBelowHundredsPassingArgumentFortyFive() throws Exception {
        String expectedValue = "FortyFive";
        String actualValue = SalesStringConverterUtil.convertAboveNineteenAndBelowTwenty(45);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertAboveNineteenBelowHundredsPassingArgumentNinetyNine() throws Exception {
        String expectedValue = "NinetyNine";
        String actualValue = SalesStringConverterUtil.convertAboveNineteenAndBelowTwenty(99);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInHundredsRangePassingArgumentOneHundredTwentyTwo() throws Exception {
        String expectedValue = "OneHundredTwentyTwo";
        String actualValue = SalesStringConverterUtil.convertInHundredsRange(122);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInHundredsRangePassingArgumentOneHundred() throws Exception {
        String expectedValue = "OneHundred";
        String actualValue = SalesStringConverterUtil.convertInHundredsRange(100);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInHundredsRangePassingArgumentNineHundredNinetyNine() throws Exception {
        String expectedValue = "NineHundredNinetyNine";
        String actualValue = SalesStringConverterUtil.convertInHundredsRange(999);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentOneThousand() throws Exception {
        String expectedValue = "OneThousand";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(1000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentOneThousandFive() throws Exception {
        String expectedValue = "OneThousandFive";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(1005);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentOneThousandFiveHundredFiftyFive() throws Exception {
        String expectedValue = "OneThousandFiveHundredFiftyFive";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(1555);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentTenThousand() throws Exception {
        String expectedValue = "TenThousand";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(10000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgument55345() throws Exception {
        String expectedValue = "FiftyFiveThousandThreeHundredFortyFive";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(55345);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentOneHundredThousand() throws Exception {
        String expectedValue = "OneHundredThousand";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(100000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentFiveHundredTwentyFiveThousandNineHundredNinetyNine() throws Exception {
        String expectedValue = "FiveHundredTwentyFiveThousandNineHundredNinetyNine";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(525999);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInThousandsRangePassingArgumentNineHundredNinetyNineThousandNineHundredNinetyNine() throws Exception {
        String expectedValue = "NineHundredNinetyNineThousandNineHundredNinetyNine";
        String actualValue = SalesStringConverterUtil.convertInThousandsRange(999999);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentOneMillion() throws Exception {
        String expectedValue = "OneMillion";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(1000000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentOneMillionFiveHundredThousand() throws Exception {
        String expectedValue = "OneMillionFiveHundredThousand";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(1500000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentTenMillion() throws Exception {
        String expectedValue = "TenMillion";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(10000000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentTenMillionSixHundredThousandFiveHundredTwentyThree() throws Exception {
        String expectedValue = "TenMillionSixHundredThousandFiveHundredTwentyThree";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(10600523);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentOneHundredMillion() throws Exception {
        String expectedValue = "OneHundredMillion";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(100000000);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void convertInMillionsRangPassingArgumentNineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine() throws Exception {
        String expectedValue = "NineHundredNinetyNineMillionNineHundredNinetyNineThousandNineHundredNinetyNine";
        String actualValue = SalesStringConverterUtil.convertInMillionRange(999999999);
        assertEquals(expectedValue, actualValue);
    }


}