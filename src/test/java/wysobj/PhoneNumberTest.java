package wysobj;

import org.junit.Test;
import wysobj.PhoneNumber;

import java.util.List;

public class PhoneNumberTest
{
    @Test
    public void testCase1()
    {
        PhoneNumber pn = new PhoneNumber();

        String testStr = "23";
        List<String> result = pn.letterCombinations(testStr);
        String[] strs = new String[]{"ad","ae","af","bd","be","bf","cd","ce","cf"};
        for (String str : strs)
        {
            assert (result.contains(str));
        }
        assert (result.size() == strs.length);
    }

    @Test
    public void testCase2()
    {
        PhoneNumber pn = new PhoneNumber();

        String testStr = "123";
        List<String> result = pn.letterCombinations(testStr);
        assert (result.isEmpty());
    }

}
