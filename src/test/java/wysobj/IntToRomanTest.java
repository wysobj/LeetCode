package wysobj;

import org.junit.Test;
import wysobj.IntToRoman;

public class IntToRomanTest
{

    @Test
    public void testValidNumberCase1()
    {
        IntToRoman transformer = new IntToRoman();

        int num1 = 3;
        String result1 = transformer.solution(num1);
        assert ("III".equals(result1));

        int num2 = 4;
        String result2 = transformer.solution(num2);
        assert ("IV".equals(result2));

        int num3 = 8;
        String result3 = transformer.solution(num3);
        assert ("VIII".equals(result3));

        int num4 = 9;
        String result4 = transformer.solution(num4);
        assert ("IX".equals(result4));
    }

    @Test
    public void testValidNumberCase2()
    {
        IntToRoman transformer = new IntToRoman();

        int num1 = 45;
        String result1 = transformer.solution(num1);
        assert ("XLV".equals(result1));

        int num2 = 99;
        String result2 = transformer.solution(num2);
        assert ("XCIX".equals(result2));

        int num3 = 3999;
        String result3 = transformer.solution(num3);
        assert ("MMMCMXCIX".equals(result3));
    }

    @Test(expected = IntToRoman.InvalidNumberException.class)
    public void testInvalidNumberCase1()
    {
        IntToRoman transformer = new IntToRoman();

        int num = -1;
        String result = transformer.solution(num);
    }

    @Test(expected = IntToRoman.InvalidNumberException.class)
    public void testInvalidNumberCase2()
    {
        IntToRoman transformer = new IntToRoman();

        int num = 4000;
        String result = transformer.solution(num);
    }
}
