package wysobj;

import org.junit.Test;
import wysobj.RomanToInteger;

public class RomanToIntegerTest
{

    @Test
    public void testValidRomanCase1()
    {
        RomanToInteger rti = new RomanToInteger();

        String roman1 = "III";
        int result1 = rti.romanToInt(roman1);
        assert (result1 == 3);

        String roman2 = "IV";
        int result2 = rti.romanToInt(roman2);
        assert (result2 == 4);

        String roman3 = "IX";
        int result3 = rti.romanToInt(roman3);
        assert (result3 == 9);
    }

    @Test
    public void testValidRomanCase2()
    {
        RomanToInteger rti = new RomanToInteger();

        String roman1 = "XLV";
        int result1 = rti.romanToInt(roman1);
        assert (result1 == 45);

        String roman2 = "XCIX";
        int result2 = rti.romanToInt(roman2);
        assert (result2 == 99);

        String roman3 = "MMMCMXCIX";
        int result3 = rti.romanToInt(roman3);
        assert (result3 == 3999);
    }

    @Test(expected = RomanToInteger.InvalidRomanException.class)
    public void testInvalidRomanCase()
    {
        RomanToInteger rti = new RomanToInteger();

        String roman = "XLJV";
        int result = rti.romanToInt(roman);
    }
}
