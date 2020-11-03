package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class KingTest {
    private Board board;
    private Square currentPosition;

    @Before
    public void before() {
        board = new Board();
        currentPosition = new Square(File.D, 5);
    }

    @Test
    public void getPossibleMoves() {
        Piece piece = new King();
        assertThat("King's possible moves :", piece.getPossibleMoves(board, currentPosition),
                is("D6, E6, E5, E4, D4, C4, C5, C6"));
    }
}