package wysobj;

import org.junit.Test;

public class AddBinaryTest
{
    @Test
    public void testCase1()
    {
        String a = "101";
        String b = "10";
        AddBinary ab = new AddBinary();
        String result = ab.addBinary(a, b);
        String benchMark = "111";
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase2()
    {
        String a = "11";
        String b = "1";
        AddBinary ab = new AddBinary();
        String result = ab.addBinary(a, b);
        String benchMark = "100";
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase3()
    {
        String a = "11";
        String b = "";
        AddBinary ab = new AddBinary();
        String result = ab.addBinary(a, b);
        String benchMark = "11";
        assert (benchMark.equals(result));
    }

    @Test
    public void testCase4()
    {
        String a = "";
        String b = "";
        AddBinary ab = new AddBinary();
        String result = ab.addBinary(a, b);
        String benchMark = "";
        assert (benchMark.equals(result));
    }
}
