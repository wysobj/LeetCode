package wysobj;

public class CountAndSay
{
    public String countAndSay(int n)
    {
        if (n == 1)
        {
            return "1";
        }
        String prevSequence = countAndSay(n - 1);
        String saySequence = say(prevSequence);
        return saySequence;
    }

    private String say(String sequence)
    {
        int start = 0;
        int end = start + 1;
        StringBuilder saidStr = new StringBuilder();
        while (start < sequence.length())
        {
            if (end < sequence.length() && sequence.charAt(end) == sequence.charAt(start))
            {
                end++;
            }
            else
            {
                int length = end - start;
                char c = sequence.charAt(start);
                saidStr.append(length);
                saidStr.append(c);
                start = end;
            }
        }
        return saidStr.toString();
    }
}
