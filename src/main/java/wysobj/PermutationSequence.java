package wysobj;

import java.util.Arrays;

public class PermutationSequence
{
    public String getPermutation(int n, int k)
    {
        if (n < 1 || k < 1)
        {
            return null;
        }
        int counter = 1;
        char[] sequence = generateSequence(n);
        while (counter < k)
        {
            int i;
            for (i = sequence.length - 2; i >= 0 && sequence[i] > sequence[i + 1]; i--)
            ;
            int idx = i + 1;
            for (int j = sequence.length - 1; j > i + 1; j--)
            {
                if (sequence[j] > sequence[i] && sequence[j] < sequence[idx])
                {
                    idx = j;
                }
            }
            swap(sequence, i, idx);
            Arrays.sort(sequence, i + 1, sequence.length);
            ++counter;
        }
        return concate(sequence);
    }

    private char[] generateSequence(int n)
    {
        char[] sequence = new char[n];
        for (int i = 0; i < n; i++)
        {
            sequence[i] = (char) ('1' + i);
        }
        return sequence;
    }

    private void swap(char[] sequence, int a, int b)
    {
        char tmp = sequence[a];
        sequence[a] = sequence[b];
        sequence[b] = tmp;
    }

    private String concate(char[] sequence)
    {
        StringBuilder sb = new StringBuilder();
        for (char c : sequence)
        {
            sb.append(c);
        }
        return sb.toString();
    }
}
