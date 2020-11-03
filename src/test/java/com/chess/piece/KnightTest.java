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
        currentPosition = new Square(File.A, 1);
    }

    @Test
    public void getPossibleMoves() {
        Piece piece = new Knight();
        assertThat("Knight's possible moves :", piece.getPossibleMoves(board, currentPosition),
                is("A2, A3, A4, A5, A6, A7, A8, B1, C1, D1, E1, F1, G1, H1"));
    }
}