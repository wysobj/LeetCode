package wysobj;

import org.junit.Test;
import wysobj.dataStructures.ListNode;
import wysobj.util.TestUtil;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedList2Test
{
    @Test
    public void testCase1()
    {
        ListNode list = TestUtil.generateList(Arrays.asList(1, 2, 3, 3, 4, 4, 5));
        ListNode benchmark = TestUtil.generateList(Arrays.asList(1, 2, 5));
        RemoveDuplicatesFromSortedList2 rdfsl = new RemoveDuplicatesFromSortedList2();
        ListNode result = rdfsl.deleteDuplicates(list);
        TestUtil.assertListSame(result, benchmark);
    }

    @Test
    public void testCase2()
    {
        ListNode list = TestUtil.generateList(Arrays.asList(1, 1, 3, 3, 4, 4, 5));
        ListNode benchmark = TestUtil.generateList(Arrays.asList(5));
        RemoveDuplicatesFromSortedList2 rdfsl = new RemoveDuplicatesFromSortedList2();
        ListNode result = rdfsl.deleteDuplicates(list);
        TestUtil.assertListSame(result, benchmark);
    }
}
