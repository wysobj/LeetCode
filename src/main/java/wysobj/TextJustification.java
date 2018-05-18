package wysobj;

import java.util.LinkedList;
import java.util.List;

public class TextJustification
{
    // words not empty, and any word in words no longer than maxWidth.
    public List<String> fullJustify(String[] words, int maxWidth)
    {
        List<String> result = new LinkedList<String>();
        int accumulateLength = 0;
        List<String> tmp = new LinkedList<String>();
        for (String word : words)
        {
            int wordLength = word.length();
            if (accumulateLength + tmp.size() + wordLength > maxWidth)
            {
                int spaceNum = tmp.size() - 1;
                int extraWidth = (maxWidth - accumulateLength);
                int spaceWidth = spaceNum > 0 ? extraWidth / spaceNum : extraWidth;
                int remainSpaceWidth = spaceNum > 0 ? extraWidth % spaceNum : 0;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < tmp.size(); i++)
                {
                    sb.append(tmp.get(i));
                    String space = generateSpace(spaceWidth);
                    sb.append(space);
                    if (i < remainSpaceWidth)
                    {
                        sb.append(' ');
                    }
                }
                String line = sb.toString();
                line = line.substring(0, maxWidth);
                result.add(line);
                tmp.clear();
                accumulateLength = wordLength;
                tmp.add(word);
            }
            else
            {
                tmp.add(word);
                accumulateLength += wordLength;
            }
        }
        StringBuilder lastLineSb = new StringBuilder();
        for (String word : tmp)
        {
            lastLineSb.append(word);
            lastLineSb.append(' ');
        }
        lastLineSb.deleteCharAt(lastLineSb.length() - 1);
        lastLineSb.append(generateSpace(maxWidth - lastLineSb.length()));
        result.add(lastLineSb.toString());
        return result;
    }

    private String generateSpace(int width)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++)
        {
            sb.append(' ');
        }
        return sb.toString();
    }
}
