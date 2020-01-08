/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test public void testRoll(){
        int input = 4;
        int[] expected = Library.roll(input);
        assertEquals(input, expected.length);
    }

    @Test public void rollBetween1and6(){
        //
    }

    @Test public void testContainsDuplicates(){
        String[] input = {"a", "b", "c", "a"};
        boolean actual = Library.containsDuplicates(input);
        boolean result = true;
        assertEquals(actual, result);
    }

    @Test public void testNoContainDuplicates(){
        String[] input = {"a", "b", "c"};
        boolean actual = Library.containsDuplicates(input);
        boolean result = false;
        assertEquals(actual, result);
    }
}
