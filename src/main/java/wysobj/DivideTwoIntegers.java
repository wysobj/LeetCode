package wysobj;

public class DivideTwoIntegers
{
    private static final int POSTIVE_BOUND = 2147483647;
    private static final int NEGATIVE_BOUND = -2147483648;

    // devisor will nerver be zero.
    public int divide(int dividend, int divisor)
    {
        if (dividend == NEGATIVE_BOUND && divisor == -1)
        {
            return POSTIVE_BOUND;
        }
        int sign = caculateSign(dividend, divisor);
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;
        int tmp = divisor;
        int exp = 0;
        while (tmp >= NEGATIVE_BOUND >> 1 && tmp << 1 >= dividend)
        {
            tmp <<= 1;
            ++exp;
        }
        int result = 0;
        for (; exp >= 0; exp--)
        {
            if (tmp >= dividend)
            {
                dividend -= tmp;
                result |= (1 << exp);
            }
            tmp >>= 1;
        }
        return sign * result;
    }

    private int caculateSign(int a, int b)
    {
        return (a > 0 && b > 0) || (a < 0 && b < 0) ? 1 : -1;
    }
}
