package wysobj;

import wysobj.dataStructures.Interval;

import java.util.LinkedList;
import java.util.List;

public class InsertInterval
{
    public List<Interval> insert(List<Interval> intervals, Interval newInterval)
    {
        List<Interval> result = new LinkedList<Interval>();
        if (intervals == null)
        {
            return result;
        }
        if (newInterval == null)
        {
            return intervals;
        }
        Interval interval = newInterval;
        boolean inserted = false;
        for (int i = 0; i < intervals.size(); i++)
        {
            Interval curInterval = intervals.get(i);
            if (isOverlap(interval, curInterval))
            {
                int start = curInterval.start < interval.start ? curInterval.start : interval.start;
                int end = curInterval.end > interval.end ? curInterval.end : interval.end;
                interval = new Interval(start, end);
            }
            else
            {
                if (curInterval.start > interval.end && !inserted)
                {
                    result.add(interval);
                    inserted = true;
                }
                result.add(curInterval);
            }
        }
        if (!inserted)
        {
            result.add(interval);
        }
        return result;
    }

    private boolean isOverlap(Interval interval1, Interval interval2)
    {
        if (interval1.start > interval2.start)
        {
            Interval tmp = interval1;
            interval1 = interval2;
            interval2 = tmp;
        }
        return interval2.start >= interval1.start && interval2.start <= interval1.end;
    }
}
