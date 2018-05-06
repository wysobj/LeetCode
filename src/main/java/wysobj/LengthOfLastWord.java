package wysobj;

public class LengthOfLastWord
{
    public int lengthOfLastWord(String str)
    {
        if (str == null || str.length() == 0)
        {
            return 0;
        }
        StringBuilder word = new StringBuilder();
        int lastLetterIdx = str.length() - 1;
        while (lastLetterIdx >= 0 && str.charAt(lastLetterIdx) == ' ')
        {
            --lastLetterIdx;
        }
        for (int i = 0; i <= lastLetterIdx; i++)
        {
            char c = str.charAt(i);
            if (c == ' ')
            {
                word = new StringBuilder();
            }
            else
            {
                word.append(c);
            }
        }
        return word.length();
    }
}
