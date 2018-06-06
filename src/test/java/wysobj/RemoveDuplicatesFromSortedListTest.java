package wysobj;

import org.junit.Test;
import wysobj.dataStructures.ListNode;
import wysobj.util.TestUtil;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedListTest
{
    @Test
    public void testCase1()
    {
        ListNode list = TestUtil.generateList(Arrays.asList(1, 1, 2));
        ListNode benchmark = TestUtil.generateList(Arrays.asList(1, 2));
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        ListNode result = rdfsl.deleteDuplicates(list);
        TestUtil.assertListSame(result, benchmark);
    }

    @Test
    public void testCase2()
    {
        ListNode list = TestUtil.generateList(Arrays.asList(1, 1, 2, 3, 3));
        ListNode benchmark = TestUtil.generateList(Arrays.asList(1, 2, 3));
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        ListNode result = rdfsl.deleteDuplicates(list);
        TestUtil.assertListSame(result, benchmark);
    }

    @Test
    public void testCase3()
    {
        ListNode list = TestUtil.generateList(Arrays.asList(1));
        ListNode benchmark = TestUtil.generateList(Arrays.asList(1));
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        ListNode result = rdfsl.deleteDuplicates(list);
        TestUtil.assertListSame(result, benchmark);
    }

    @Test
    public void testCase4()
    {
        ListNode list = null;
        RemoveDuplicatesFromSortedList rdfsl = new RemoveDuplicatesFromSortedList();
        ListNode result = rdfsl.deleteDuplicates(list);
        assert (result == null);
    }
}
