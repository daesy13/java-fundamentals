package inheritance;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    Theater amc;

    @Before
    public void initialize(){
        amc = new Theater("AMC", "$$");

        amc.addMovie("Frozen");
        amc.addMovie("Tarzan");

        Review movieReview1 = new Review("It was very chilly", "Susan Smith", 3, "Frozen");
        Review movieReview2 = new Review("It was very wild", "Jhon Doe", 5, "Tarzan");

        amc.addReview(movieReview1);
        amc.addReview(movieReview2);
    }

    @Test public void theaterNameTest() {
        String expected = "AMC";
        String actual = amc.name;
        assertEquals(expected, actual);
    }

    @Test public void theaterReviewTest(){
        String expected = "It was very chilly";
        String actual = amc.reviewList.get(0).toStringReview();
        assertEquals(expected,actual);
    }


    @Test public void reviewMovieTitleTest(){
        String actual = amc.reviewList.get(1).movieTitle;
        String expected = "Tarzan";
        assertEquals(expected, actual);
    }

    @Test public void reviewAddNewMovieTest(){
        amc.addMovie("Titanic");
        boolean actual = amc.moviesPlaying.contains("Titanic");
        assertTrue(actual);
    }

    @Test public void reviewRemoveNewMovieTest(){
        amc.removeMovie("Titanic");
        boolean actual = amc.moviesPlaying.contains("Titanic");
        assertFalse(actual);
    }

}
