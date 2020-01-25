package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    Restaurant casaBonita;
    Restaurant goodBurger;

    //     http://junit.sourceforge.net/javadoc/org/junit/Before.html
    @Before
    public void initialize(){
        casaBonita = new Restaurant("Casa Bonita","$$");
        goodBurger = new Restaurant("Good Burger", "$");

        Review review1CB = new Review("Food is so good", "Jhon Doe", 5);
        Review review2CB = new Review("Service was excellent but my food was cold", "Susan Smith", 3);
        Review review1GB = new Review("Burgers are delicious", "Dexter", 5);
        Review review2GB = new Review("Not what I expected", "Mr. Wheat", 2);

        casaBonita.addReview(review1CB);
        casaBonita.addReview(review2CB);
        goodBurger.addReview(review1GB);
        goodBurger.addReview(review2GB);

    }

    @Test public void addReviewTest (){
        String expectedReview1 = "Food is so good";
        String actualReview1 = casaBonita.reviewList.get(0).toStringReview();
        assertEquals(expectedReview1, actualReview1);

        String expectedReview2 = "Not what I expected";
        String actualReview2 = goodBurger.reviewList.get(1).toStringReview();
        assertEquals(expectedReview2, actualReview2);
    }

    @Test public void updateStarsTest(){
        int expectedRestaurant1 = 4;
        int actualRestaurant1 = casaBonita.starRating;
        assertEquals(expectedRestaurant1, actualRestaurant1);

        int expectedRestaurant2 = 3;
        int actualRestaurant2 = goodBurger.starRating;
        assertEquals(expectedRestaurant2, actualRestaurant2);
    }

    @Test public void 

}
