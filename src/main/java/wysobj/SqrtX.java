package wysobj;

public class SqrtX
{
    public int mySqrt(int x)
    {
        int base = 1;
        if (x == 0)
        {
            return 0;
        }
        if (x < 3)
        {
            return 1;
        }
        while (x / base > base)
        {
            base = base * 2;
        }
        int min = base / 2;
        int max = base;
        return binarySearchSqrt(x, min, max);
    }

    private int binarySearchSqrt(int x, int min, int max)
    {
        while (min < max)
        {
            int middle = (min + max) / 2;
            if (x / middle >= middle && x / (middle + 1) < (middle + 1))
            {
                return middle;
            }
            else if (x / middle < middle)
            {
                max = middle;
            }
            else
            {
                min = middle + 1;
            }
        }
        return min;
    }
}
