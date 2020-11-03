package com.chess.board.squares;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class LocationTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
    }

    @Test
    public void getFile() {
        Integer rank = 1;
        Location locationA1 = new Location(File.A, rank);
        assertThat("Test File Location for Board", locationA1.getFile(), is(File.A));
    }

    @Test
    public void getRank() {
        Integer rank = 1;
        Location locationA1 = new Location(File.A, rank);
        assertThat("Test Rank Location for Board", locationA1.getRank(), is(1));
    }

    @Test
    public void testEquals() {
        Integer rank1 = 1;
        Location location1st = new Location(File.A, rank1);
        Location location2nd = new Location(File.A, rank1);
        assertThat("Test the location are equals :", location1st.equals(location2nd), is(true));

        Integer rank2 = 2;
        Location location3rd = new Location(File.A, rank1);
        Location location4th = new Location(File.B, rank2);
        assertThat("Test the location are not equals :", location3rd
                .equals(location4th), is(not(true)));
    }

    @Test
    public void testToString() {
        Integer rank = 1;
        Location locationA1 = new Location(File.A, rank);
        assertThat("Test the location are  :", locationA1.toString(), equalToIgnoringCase("Location{file=A, rank=1}"));
    }
}