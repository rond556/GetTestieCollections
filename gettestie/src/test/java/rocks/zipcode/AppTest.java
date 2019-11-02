package rocks.zipcode;

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
        String expectedPostCode = "19810"
        Address address = new Address(street, town, postCode);

        String actualStreet = address.getStreet();
        String actualTown = address.getTown();
        String actualPostCode = address.getPostCode();

        Assert.assertEquals.
    }
}
