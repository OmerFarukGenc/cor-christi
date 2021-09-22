package corchristi;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BetweenTest {
    @Test
    public void TestEmptyResult() {
        assertTrue(Arrays.asList().equals(App.between(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14)),
                new Integer(3), new Integer(5), new Integer(3))));
    }

    @Test
    public void TestNIsZero() {
        assertTrue(Arrays.asList().equals(App.between(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14)),
                new Integer(3), new Integer(5), new Integer(0))));
    }

    @Test
    public void TestThreeNumberedResult() {
        assertTrue(
                Arrays.asList(11, 12, 13).equals(App.between(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14)),
                        new Integer(10), new Integer(15), new Integer(3))));
    }

    @Test
    public void AGreaterThanBReturnsEmpty() {
        assertTrue(Arrays.asList().equals(App.between(new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14)),
                new Integer(10), new Integer(5), new Integer(100))));
    }

    @Test
    public void TestDuplicateNumber() {
        assertTrue(Arrays.asList(10, 11).equals(App.between(new ArrayList<Integer>(Arrays.asList(10, 11, 10, 13, 14)),
                new Integer(9), new Integer(20), new Integer(2))));
    }
}
