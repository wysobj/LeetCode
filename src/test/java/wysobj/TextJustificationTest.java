package wysobj;

import org.junit.Test;

import java.util.List;

public class TextJustificationTest
{
    @Test
    public void testCase1()
    {
        String[] words = new String[]{"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        TextJustification tj = new TextJustification();
        List<String> result = tj.fullJustify(words, maxWidth);
        for (String s : result)
        {
            System.out.println(s.replace(' ', '*'));
        }
    }

    @Test
    public void testCase2()
    {
        String[] words = new String[]{"Science","is","what","we","understand","well","enough","to","explain",
                "to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        TextJustification tj = new TextJustification();
        List<String> result = tj.fullJustify(words, maxWidth);
        for (String s : result)
        {
            System.out.println(s.replace(' ', '*'));
        }
    }
}
