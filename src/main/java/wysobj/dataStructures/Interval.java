package wysobj.dataStructures;


public class Interval
{
    public int start;
    public int end;

    public Interval()
    {
        this.start = 0;
        this.end = 0;
    }

    public Interval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }

    public boolean equals(Object o)
    {
        if (o == null || !(o instanceof Interval))
        {
            return false;
        }
        Interval other = (Interval)o;
        return this.start == other.start && this.end == other.end;
    }
}