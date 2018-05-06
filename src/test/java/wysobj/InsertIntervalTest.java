package wysobj;

import org.junit.Test;
import wysobj.InsertInterval;
import wysobj.MergeIntervals;
import wysobj.dataStructures.Interval;

import java.util.LinkedList;
import java.util.List;

public class InsertIntervalTest
{
    @Test
    public void testCase1()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        Interval inserted = new Interval(2, 5);
        InsertInterval ii = new InsertInterval();
        List<Interval> result = ii.insert(intervals, inserted);
        assert (result.contains(new Interval(1, 5)));
        assert (result.contains(new Interval(6, 9)));
        assert (result.size() == 2);
    }

    @Test
    public void testCase2()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(12, 16));
        Interval inserted = new Interval(4, 8);
        InsertInterval ii = new InsertInterval();
        List<Interval> result = ii.insert(intervals, inserted);
        assert (result.contains(new Interval(1, 2)));
        assert (result.contains(new Interval(3, 10)));
        assert (result.contains(new Interval(12, 16)));
        assert (result.size() == 3);
    }

    @Test
    public void testCase3()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        Interval inserted = new Interval(1, 5);
        InsertInterval ii = new InsertInterval();
        List<Interval> result = ii.insert(intervals, inserted);
        assert (result.contains(new Interval(1, 5)));
        assert (result.size() == 1);
    }
}
