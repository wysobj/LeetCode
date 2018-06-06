package wysobj;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddress
{
    public List<String> restoreIpAddresses(String s)
    {
        List<String> result = new LinkedList<String>();
        if (s == null || s.length() < 4)
        {
            return result;
        }
        subroutine(new LinkedList<String>(), s, 0, result);
        return result;
    }

    private static final int IP_SEGMENTS_NUM = 4;
    private static final int IP_SEGMENT_MAXLENGTH = 3;
    private static final int IP_SEGMENT_MAXVALUE = 255;
    private void subroutine(List<String> segments, String s, int cursor, List<String> result)
    {
        int remainDigitNum = s.length() - cursor;
        int remainSegmentNum = IP_SEGMENTS_NUM - segments.size();
        if (remainDigitNum < remainSegmentNum || remainDigitNum > remainSegmentNum * IP_SEGMENT_MAXLENGTH)
        {
            return;
        }
        if (cursor == s.length())
        {
            if (segments.size() == IP_SEGMENTS_NUM)
            {
                result.add(transformToIPAddress(segments));
            }
            else
            {
                return;
            }
        }
        int start = cursor + 1;
        int end = cursor + IP_SEGMENT_MAXLENGTH > s.length() ? s.length() : cursor + IP_SEGMENT_MAXLENGTH;
        for (int i = start; i <= end; i++)
        {
            String segment = s.substring(cursor, i);
            if (segment.startsWith("0") && segment.length() > 1)
            {
                continue;
            }
            if (Integer.parseInt(segment) > IP_SEGMENT_MAXVALUE)
            {
                continue;
            }
            List<String> copy = new LinkedList<String>(segments);
            copy.add(segment);
            subroutine(copy, s, i, result);
        }
    }

    private String transformToIPAddress(List<String> s)
    {
        assert (s.size() == 4);
        StringBuilder sb = new StringBuilder();
        sb = sb.append(s.get(0))
                .append(".")
                .append(s.get(1))
                .append(".")
                .append(s.get(2))
                .append(".")
                .append(s.get(3));
        return sb.toString();
    }
}
