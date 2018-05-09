package wysobj;

import org.junit.Test;

public class CountAndSayTest
{
    @Test
    public void testCase1()
    {
        CountAndSay cas = new CountAndSay();
        int n = 1;
        String sequence = "1";
        String result = cas.countAndSay(n);
        assert (sequence.equals(result));
    }

    @Test
    public void testCase2()
    {
        CountAndSay cas = new CountAndSay();
        int n = 2;
        String sequence = "11";
        String result = cas.countAndSay(n);
        assert (sequence.equals(result));
    }

    @Test
    public void testCase3()
    {
        CountAndSay cas = new CountAndSay();
        int n = 3;
        String sequence = "21";
        String result = cas.countAndSay(n);
        assert (sequence.equals(result));
    }

    @Test
    public void testCase4()
    {
        CountAndSay cas = new CountAndSay();
        int n = 4;
        String sequence = "1211";
        String result = cas.countAndSay(n);
        assert (sequence.equals(result));
    }

    @Test
    public void testCase5()
    {
        CountAndSay cas = new CountAndSay();
        int n = 5;
        String sequence = "111221";
        String result = cas.countAndSay(n);
        assert (sequence.equals(result));
    }
}
