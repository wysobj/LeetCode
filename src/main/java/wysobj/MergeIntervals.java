package wysobj;

import wysobj.dataStructures.Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals
{
    public List<Interval> merge(List<Interval> intervals)
    {
        List<Interval> result = new LinkedList<Interval>();
        if (intervals == null || intervals.size() == 0)
        {
            return result;
        }
        Collections.sort(intervals, new IntervalComparator());
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++)
        {
            Interval intervalAtI = intervals.get(i);
            if (intervalAtI.start <= end)
            {
                if (intervalAtI.end > end)
                {
                    end = intervalAtI.end;
                }
            }
            else
            {
                Interval interval = new Interval(start, end);
                result.add(interval);
                start = intervalAtI.start;
                end = intervalAtI.end;
            }
        }
        Interval interval = new Interval(start, end);
        result.add(interval);
        return result;
    }

    private static class IntervalComparator implements Comparator<Interval>
    {

        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }
}
