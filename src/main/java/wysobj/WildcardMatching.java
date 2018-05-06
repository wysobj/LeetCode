package wysobj;

public class WildcardMatching
{
    public boolean isMatch(String s, String p)
    {
        if (s == null || p == null)
        {
            return false;
        }

        if (p.length() == 0)
        {
            return s.length() == 0;
        }

        boolean[][] matchMatrix = new boolean[s.length() + 1][p.length() + 1];
        matchMatrix[0][0] = true;

        for (int i = 0; i <= s.length(); i++)
        {
            for (int j = 1; j <= p.length(); j++)
            {
                char pChar = p.charAt(j - 1);
                if (pChar == '*')
                {
                    matchMatrix[i][j] = (i > 0 && matchMatrix[i - 1][j]) || matchMatrix[i][j - 1];
                }
                else if (i > 0 && (pChar == '?' || pChar == s.charAt(i - 1)))
                {
                    matchMatrix[i][j] = matchMatrix[i - 1][j - 1];
                }
            }
        }
        return matchMatrix[s.length()][p.length()];
    }
}
