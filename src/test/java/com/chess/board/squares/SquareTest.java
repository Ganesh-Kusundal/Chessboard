package com.chess.board.squares;

import org.junit.Test;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertThat;

public class SquareTest {

    @Test
    public void testSquare() {
        Square sqaure = new Square(new Location(File.A, 1));
        assertThat("Test Sqaure", sqaure.getLocation().toString(), equalToIgnoringCase("Location{file=A, rank=1}"));
    }
}