package com.chess.piece;

import com.chess.board.Board;
import com.chess.common.Square;

public interface Piece {
    String getPossibleMoves(Board board, Square currentPosition);
}
