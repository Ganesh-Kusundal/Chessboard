package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class KnightTest {
    private Board board;
    private Square currentPosition;

    @Before
    public void before() {
        board = new Board();
        currentPosition = new Square(File.D, 5);
    }

    @Test
    public void getPossibleMoves() {
        Piece piece = new Knight();
        piece.initialize(board, currentPosition);
        assertThat("Knight's possible moves :", piece.getPossibleMoves().toString(),
                is("[F4, E3, C3, B4, B6, C7, E7, F6]"));
    }
}