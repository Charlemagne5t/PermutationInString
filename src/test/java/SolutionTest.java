import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void checkInclusionTest1(){
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean actual = new Solution().checkInclusion(s1, s2);

        Assert.assertTrue(actual);
    }
    @Test
    public void checkInclusionTest2(){
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean actual = new Solution().checkInclusion(s1, s2);

        Assert.assertFalse(actual);
    }
    @Test
    public void checkInclusionTest3(){
        String s1 = "adc";
        String s2 = "dcda";
        boolean actual = new Solution().checkInclusion(s1, s2);

        Assert.assertTrue(actual);
    }
}
