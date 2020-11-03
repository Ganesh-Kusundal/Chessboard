package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopTest {
    private Board board;
    private Square currentPosition;

    @Before
    public void before() {
        board = new Board();
        currentPosition = new Square(File.A, 1);
    }

    @Test
    public void getPossibleMoves() {
        Piece piece = new Bishop();
        assertThat("Bishop's possible moves :", piece.getPossibleMoves(board, currentPosition),
                is(""));
    }
}