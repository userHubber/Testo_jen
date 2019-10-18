package test;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewEmptyTestNGTest {

    public NewEmptyTestNGTest() {
    }
    int i;

    @BeforeClass
    public void setUpClass() {
        System.out.println("hello");
        i = 4;
    }

    @Test
    public void testClass() {
        Assert.assertTrue(i == 5);
    }

    @Test
    public void testClass2() {
        Assert.assertFalse(i == 5);
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("the end");
    }

}
