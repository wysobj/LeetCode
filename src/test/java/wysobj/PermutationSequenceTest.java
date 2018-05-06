package wysobj;

import org.junit.Test;

public class PermutationSequenceTest
{
    @Test
    public void testCase1()
    {
        int n = 3;
        int k = 3;
        PermutationSequence ps = new PermutationSequence();
        String result = ps.getPermutation(n, k);
        assert (result.equals("213"));
    }

    @Test
    public void testCase2()
    {
        int n = 4;
        int k = 9;
        PermutationSequence ps = new PermutationSequence();
        String result = ps.getPermutation(n, k);
        assert (result.equals("2314"));
    }
}
