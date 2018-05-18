package wysobj;

import org.junit.Test;

public class EditDistanceTest
{
    @Test
    public void testCase1()
    {
        String s1 = "horse";
        String s2 = "ros";
        EditDistance ed = new EditDistance();
        int result = ed.minDistance(s1, s2);
        ed.sayHowToChangeS1ToS2InMinEditDistance(s1, s2);
        assert (result == 3);
    }

    @Test
    public void testCase2()
    {
        String s1 = "intention";
        String s2 = "execution";
        EditDistance ed = new EditDistance();
        int result = ed.minDistance(s1, s2);
        ed.sayHowToChangeS1ToS2InMinEditDistance(s1, s2);
        assert (result == 5);
    }

    @Test
    public void testCase3()
    {
        String s1 = "wysobj";
        String s2 = "";
        EditDistance ed = new EditDistance();
        int result = ed.minDistance(s1, s2);
        ed.sayHowToChangeS1ToS2InMinEditDistance(s1, s2);
        assert (result == 6);
    }

    @Test
    public void testCase4()
    {
        String s1 = "";
        String s2 = "";
        EditDistance ed = new EditDistance();
        int result = ed.minDistance(s1, s2);
        ed.sayHowToChangeS1ToS2InMinEditDistance(s1, s2);
        assert (result == 0);
    }
}
