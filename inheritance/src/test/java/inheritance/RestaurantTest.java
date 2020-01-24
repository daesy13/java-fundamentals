package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    Restaurant casaBonita;
    Restaurant goodBurger;

//     http://junit.sourceforge.net/javadoc/org/junit/Before.html
    @Before public void initialize(){
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

    @Test public void restaurantTest(){
        String expectedR1 = "Name: Casa Bonita, Price: $$, Start:4";
        String actualR1 = casaBonita.toString();
        assertEquals(expectedR1,actualR1);

        String expectedR2 = "Name: Good Burger, Price: $, Start:3";
        String actualR2 = goodBurger.toString();
        assertEquals(expectedR2,actualR2);
    }

}
