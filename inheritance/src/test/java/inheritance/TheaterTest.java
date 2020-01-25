package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    Theater amc;

    @Before
    public void initialize(){
        amc = new Theater("AMC", "$$");

        amc.addMovie("Frozen");
        amc.addMovie("Tarzan");

        Review movieReview1 = new Review("It was very chilly", "Susan Smith", 3, "Frozen");
        Review movieReview2 = new Review("It was very wild", "Jhon Doe", 5, "Tarzan");
    }

    @Test public void theaterNameTest() {
        String expected = "AMC";
        String actual = amc.name;
        assertEquals(expected, actual);
    }

    @Test public void theaterDataTest(){
        String expectedM1 = "Name: AMC, Price: $$, Start:3";
        String actualM1 = amc.toString();
        assertEquals(expectedM1,actualM1);
    }


    @Test public void reviewAddMovieTest(){}

}
