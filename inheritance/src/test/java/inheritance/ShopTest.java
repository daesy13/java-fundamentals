package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop theGoodMechanic;
    Shop goodBurger;

    //     http://junit.sourceforge.net/javadoc/org/junit/Before.html
    @Before public void initialize(){
        theGoodMechanic = new Shop("The Good Mechanic","$$");
        Review review1CB = new Review("Service is so good", "Jhon Doe", 5);
        theGoodMechanic.addReview(review1CB);

    }

    @Test public void shopTest(){
        String expectedS1 = "Name: The Good Mechanic, Price: $$, Start:4";
        String actualS1 = theGoodMechanic.toString();
        assertEquals(expectedS1,actualS1);
    }

}
