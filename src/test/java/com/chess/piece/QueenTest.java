package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class QueenTest {
    private Board board;
    private Square currentPosition;

    @Before
    public void before() {
        board = new Board();
        currentPosition = new Square(File.D, 5);
    }

    @Test
    public void getPossibleMoves() {
        Piece piece = new Queen();
        piece.initialize(board, currentPosition);
        assertThat("Queen's possible moves :", piece.getPossibleMoves().toString(),
                is("[E4, F3, G2, H1, E6, F7, G8, C6, B7, A8, C4, B3, A2, E5, F5, G5, H5, D4, D3, D2, D1, C5, B5, A5, D6, D7, D8]"));
    }
}