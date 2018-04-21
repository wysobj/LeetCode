package wysobj;

public class RegularExpression
{
    public boolean isMatch(String s, String p)
    {
        if (s == null || p == null)
        {
            throw new InvalidArgumentException();
        }
        return isSubStrMatch(s, p, 0, 0);
    }

    private boolean isSubStrMatch(String s, String p, int sidx, int pidx)
    {
        if (sidx == s.length())
        {
            if (pidx == p.length())
            {
                return true;
            }
            else
            {
                if (p.charAt(pidx) == '*')
                {
                    return isSubStrMatch(s, p, sidx, pidx+1);
                }
                else if (pidx+1 < p.length() && p.charAt(pidx+1) == '*')
                {
                    return isSubStrMatch(s, p, sidx, pidx+2);
                }
            }
        }
        else
        {
            if (pidx == p.length())
            {
                return false;
            }
            else if (s.charAt(sidx) == p.charAt(pidx) || p.charAt(pidx) == '.')
            {
                if (pidx + 1 < p.length() && p.charAt(pidx+1) == '*') {
                    return isSubStrMatch(s, p, sidx, pidx+2) || isSubStrMatch(s, p, sidx+1, pidx+1);
                }
                return isSubStrMatch(s, p, sidx+1, pidx+1);
            }
            else if (p.charAt(pidx) == '*')
            {
                if (pidx - 1 < 0)
                {
                    throw new InvalidArgumentException();
                }
                else if (p.charAt(pidx - 1) == '*')
                {
                    throw new InvalidArgumentException();
                }
                else if (p.charAt(pidx - 1) == s.charAt(sidx) || p.charAt(pidx - 1) == '.')
                {
                    return isSubStrMatch(s, p, sidx+1, pidx) ||
                            isSubStrMatch(s, p, sidx, pidx+1);
                }
                return isSubStrMatch(s, p, sidx, pidx+1) || isSubStrMatch(s, p, sidx-1, pidx+1);
            }
            else if (pidx + 1 < p.length() && p.charAt(pidx+1) == '*') {
                return isSubStrMatch(s, p, sidx, pidx+2);
            }
        }
        return false;
    }

    static class InvalidArgumentException extends RuntimeException {}
}
