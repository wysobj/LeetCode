package wysobj;

import org.junit.Test;

public class MultiplyStringsTest
{
    @Test
    public void testCase1()
    {
        String str1 = "10";
        String str2 = "10";
        MultiplyStrings ms = new MultiplyStrings();
        String result = ms.multiply(str1, str2);
        assert (result.equals("100"));
    }

    @Test
    public void testCase2()
    {
        String str1 = "123";
        String str2 = "456";
        MultiplyStrings ms = new MultiplyStrings();
        String result = ms.multiply(str1, str2);
        assert (result.equals("56088"));
    }
}
