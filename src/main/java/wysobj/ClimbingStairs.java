package wysobj;

public class ClimbingStairs
{
    public int climbStairs(int n)
    {
        if (n <= 2)
        {
            return n;
        }
        int e1 = 1;
        int e2 = 2;
        for (int i = 3; i <= n; i++)
        {
            int tmp = e2;
            e2 = e1 + e2;
            e1 = tmp;
        }
        return e2;
    }
}
