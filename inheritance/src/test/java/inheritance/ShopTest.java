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
        Review review2CB = new Review("Not what I expected", "Mr. Complainer", 2);

        theGoodMechanic.addReview(review1CB);
        theGoodMechanic.addReview(review2CB);


    }

    @Test public void shopTest(){
        String expectedS1 = "Name: The Good Mechanic, Price: $$, Start:5";
        String actualS1 = theGoodMechanic.toString();
        assertEquals(expectedS1,actualS1);
    }

    @Test public void averageReviewTest(){
        int actual = theGoodMechanic.starRating;
        int expected = 3;
        assertEquals(expected, actual);
    }

}
