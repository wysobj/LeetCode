package wysobj;

import wysobj.dataStructures.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTree
{
    public int numTrees(int n)
    {
        if (n < 1)
        {
            return 0;
        }
        int[] nums = new int[n+1];
        nums[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            int count = 0;
            for (int leftNodesNum = 0; leftNodesNum < i; leftNodesNum++)
            {
                int rightNodesNum = i - 1 - leftNodesNum;
                int leftChildsNum = leftNodesNum > 0 ? nums[leftNodesNum] : 1;
                int rightChildsNum = rightNodesNum > 0 ? nums[rightNodesNum] : 1;
                count += leftChildsNum * rightChildsNum;
            }
            nums[i] = count;
        }
        return nums[n];
    }
}
