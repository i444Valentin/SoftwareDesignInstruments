package loggingTest;

import org.junit.Assert;

class SearchSmallestTest {

    @org.junit.jupiter.api.Test
    void main() {
        int a = -13;
        int b = 13;
        int t = 0;
        int R = SearchSmallestTesting.function(a);
        int expect = SearchSmallestTesting.taskRelease(a,b, a,R,t);
        int actual = 4;
        Assert.assertEquals(expect,actual);
    }
}