package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Square;

public abstract class Piece implements Movable {
    Board board;
    Square currentPosition;

    public void initialize(Board board, Square currentPosition) {
        this.board = board;
        this.currentPosition = currentPosition;
    }

    protected int getRelativeOffset(Integer value, int offset) {
        return value + offset;
    }
}
