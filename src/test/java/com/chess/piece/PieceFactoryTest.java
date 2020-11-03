package com.chess.piece;

import com.chess.validator.InvalidInputException;
import org.junit.Test;

import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;

public class PieceFactoryTest {

    @Test
    public void getInstance() {
        assertThat("Is King instance:", PieceFactory.getInstance("King"), isA(Piece.class));
        assertThat("Is Knight instance:", PieceFactory.getInstance("Knight"), isA(Piece.class));
        assertThat("Is Queen instance:", PieceFactory.getInstance("Queen"), isA(Piece.class));
        assertThat("Is Pawn instance:", PieceFactory.getInstance("Pawn"), isA(Piece.class));
        assertThat("Is Rook instance:", PieceFactory.getInstance("Rook"), isA(Piece.class));
        assertThat("Is Bishop instance:", PieceFactory.getInstance("Bishop"), isA(Piece.class));
    }

    @Test(expected = InvalidInputException.class)
    public void should_throw_exception_on_invalid_input() {
        PieceFactory.getInstance("InvalidInput");
    }
}