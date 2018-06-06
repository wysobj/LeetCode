package wysobj;

import org.junit.Test;
import wysobj.util.TestUtil;

import java.util.Arrays;
import java.util.List;

public class GrayCodeTest
{
    @Test
    public void testCase1()
    {
        int n = 1;
        GrayCode gc = new GrayCode();
        List<Integer> result = gc.grayCode(n);
        assert (result.equals(Arrays.asList(0, 1)));
    }

    @Test
    public void testCase2()
    {
        int n = 2;
        GrayCode gc = new GrayCode();
        List<Integer> result = gc.grayCode(n);
        assert (result.equals(Arrays.asList(0, 1, 3, 2)));
    }

    @Test
    public void testCase3()
    {
        int n = 4;
        GrayCode gc = new GrayCode();
        List<Integer> result = gc.grayCode(n);
        assert (result.equals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8)));
    }
}
