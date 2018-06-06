package wysobj;

import org.junit.Test;
import wysobj.dataStructures.ListNode;
import wysobj.util.TestUtil;

import java.util.Arrays;

public class PartitionListTest
{
    @Test
    public void testCase1()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 5, 2));
        int x = 3;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1, 2, 2, 4, 3, 5));
        PartitionList pl = new PartitionList();
        ListNode result = pl.partition(head, x);
        TestUtil.assertListSame(result, benchMark);
    }

    @Test
    public void testCase2()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 5, 2));
        int x = 1;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 5, 2));
        PartitionList pl = new PartitionList();
        ListNode result = pl.partition(head, x);
        TestUtil.assertListSame(result, benchMark);
    }

    @Test
    public void testCase3()
    {
        ListNode head = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 5, 2));
        int x = 5;
        ListNode benchMark = TestUtil.generateList(Arrays.asList(1, 4, 3, 2, 2, 5));
        PartitionList pl = new PartitionList();
        ListNode result = pl.partition(head, x);
        TestUtil.assertListSame(result, benchMark);
    }
}
