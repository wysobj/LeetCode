package wysobj;

public class MyPower
{
    public double myPow(double x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        int sign = n > 0 ? 1 : -1;
        n = Math.abs(n);
        int power = powerOfTwo(n);
        int remain = n - (1 << power);
        double result = x;
        for (int i = 0; i < power; i++)
        {
            result = result * result;
        }
        result *= myPow(x, remain);
        if (sign < 0)
        {
            result = 1 / result;
        }
        return result;
    }

    private int powerOfTwo(int n)
    {
        int power = 0;
        while ((1 << power) > 0 && (1 << power) < n)
        {
            power++;
        }
        return power;
    }
}
