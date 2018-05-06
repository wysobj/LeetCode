package wysobj;

import org.junit.Test;

import java.util.Arrays;

public class RotateImageTest
{
    @Test
    public void tetCase1()
    {
        int[][] image = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };
        RotateImage ri = new RotateImage();
        ri.rotate(image);
        int[][] benchMark = new int[][]{
                new int[]{7, 4, 1},
                new int[]{8, 5, 2},
                new int[]{9, 6, 3}
        };
        assertImageSame(image, benchMark);
    }

    @Test
    public void tetCase2()
    {
        int[][] image = new int[][]{
                new int[]{5, 1, 9, 11},
                new int[]{2, 4, 8, 10},
                new int[]{13, 3, 6, 7},
                new int[]{15, 14, 12, 16},
        };
        RotateImage ri = new RotateImage();
        ri.rotate(image);
        int[][] benchMark = new int[][]{
                new int[]{15, 13, 2, 5},
                new int[]{14, 3, 4, 1},
                new int[]{12, 6, 8, 9},
                new int[]{16, 7, 10, 11}
        };
        assertImageSame(image, benchMark);
    }

    private void assertImageSame(int[][] img1, int[][] img2)
    {
        for (int i = 0; i < img1.length; i++)
        {
            for (int j = 0; j < img2.length; j++)
            {
                assert (img1[i][j] == img2[i][j]);
            }
        }
    }
}
