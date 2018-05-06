package wysobj;

import org.junit.Test;

public class LengthOfLastWordTest
{
    @Test
    public void testCase1()
    {
        String str = "Hello World";
        LengthOfLastWord lolw = new LengthOfLastWord();
        int length = lolw.lengthOfLastWord(str);
        assert (length == 5);
    }

    @Test
    public void testCase2()
    {
        String str = "Hello ";
        LengthOfLastWord lolw = new LengthOfLastWord();
        int length = lolw.lengthOfLastWord(str);
        assert (length == 5);
    }
}
