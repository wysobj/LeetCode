package wysobj;

import org.junit.Test;
import wysobj.dataStructures.Interval;

import java.util.LinkedList;
import java.util.List;

public class MergeIntervalsTest
{
    @Test
    public void testCase1()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        MergeIntervals mi = new MergeIntervals();
        List<Interval> result = mi.merge(intervals);
        assert (result.contains(new Interval(1, 6)));
        assert (result.contains(new Interval(8, 10)));
        assert (result.contains(new Interval(15, 18)));
        assert (result.size() == 3);
    }

    @Test
    public void testCase2()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(4, 5));
        MergeIntervals mi = new MergeIntervals();
        List<Interval> result = mi.merge(intervals);
        assert (result.contains(new Interval(1, 5)));
        assert (result.size() == 1);
    }

    @Test
    public void testCase3()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(2, 6));
        MergeIntervals mi = new MergeIntervals();
        List<Interval> result = mi.merge(intervals);
        assert (result.contains(new Interval(1, 6)));
        assert (result.contains(new Interval(8, 10)));
        assert (result.contains(new Interval(15, 18)));
        assert (result.size() == 3);
    }

    @Test
    public void testCase4()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(15, 18));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(16, 17));
        MergeIntervals mi = new MergeIntervals();
        List<Interval> result = mi.merge(intervals);
        assert (result.contains(new Interval(1, 6)));
        assert (result.contains(new Interval(8, 10)));
        assert (result.contains(new Interval(15, 18)));
        assert (result.size() == 3);
    }

    @Test
    public void testCase5()
    {
        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(new Interval(1, 4));
        MergeIntervals mi = new MergeIntervals();
        List<Interval> result = mi.merge(intervals);
        assert (result.contains(new Interval(1, 4)));
        assert (result.size() == 1);
    }
}
