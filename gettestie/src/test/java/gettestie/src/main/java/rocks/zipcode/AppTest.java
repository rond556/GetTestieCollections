package gettestie.src.main.java.rocks.zipcode;

import gettestie.src.main.java.rocks.zipcode.Address;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void addressConstructorTest(){
        String expectedStreet = "Landon Drive";
        String expectedTown = "Wilmington";
        String expectedPostCode = "19810";
        Address address = new Address(expectedStreet, expectedTown, expectedPostCode);

        String actualStreet = address.getStreet();
        String actualTown = address.getTown();
        String actualPostCode = address.getPostCode();

        Assert.assertEquals(expectedStreet,actualStreet);
        Assert.assertEquals(expectedTown,actualTown);
        Assert.assertEquals(expectedPostCode,expectedPostCode);
    }
}
