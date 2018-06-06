package wysobj;

import org.junit.Test;

import java.util.List;

public class RestoreIPAddressTest
{
    @Test
    public void testCase1()
    {
        String ip = "25525511135";
        RestoreIPAddress ria = new RestoreIPAddress();
        List<String> result = ria.restoreIpAddresses(ip);
        assert (result.size() == 2);
        assert (result.contains("255.255.11.135"));
        assert (result.contains("255.255.111.35"));
    }

    @Test
    public void testCase2()
    {
        String ip = "255255111035";
        RestoreIPAddress ria = new RestoreIPAddress();
        List<String> result = ria.restoreIpAddresses(ip);
        assert (result.isEmpty());
    }

    @Test
    public void testCase3()
    {
        String ip = "0000";
        RestoreIPAddress ria = new RestoreIPAddress();
        List<String> result = ria.restoreIpAddresses(ip);
        assert (result.size() == 1);
        assert (result.contains("0.0.0.0"));
    }
}
