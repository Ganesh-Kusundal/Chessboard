package com.chess.common;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @Test
    public void getFile() {
        Integer rank = 1;
        Square squareA1 = new Square(File.A, rank);
        assertThat("Test File Location for Board", squareA1.getFile(), is(File.A));
    }

    @Test
    public void getRank() {
        Integer rank = 1;
        Square squareA1 = new Square(File.A, rank);
        assertThat("Test Rank Location for Board", squareA1.getRank(), is(1));
    }

    @Test
    public void testEquals() {
        Integer rank1 = 1;
        Square square1St = new Square(File.A, rank1);
        Square square2Nd = new Square(File.A, rank1);
        assertThat("Test the location are equals :", square1St.equals(square2Nd), is(true));

        Integer rank2 = 2;
        Square square3Rd = new Square(File.A, rank1);
        Square square4Th = new Square(File.B, rank2);
        assertThat("Test the location are not equals :", square3Rd
                .equals(square4Th), is(not(true)));
    }

    @Test
    public void testToString() {
        Integer rank = 1;
        Square squareA1 = new Square(File.A, rank);
        assertThat("Test the location are  :", squareA1.toString(), equalToIgnoringCase("Location{file=A, rank=1}"));
    }
}