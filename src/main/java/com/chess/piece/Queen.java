package com.chess.piece;

import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece {

    @Override
    public List<String> getPossibleMoves() {
        List<String> moves = new ArrayList<>();
        Piece bishop = PieceFactory.getInstance("Bishop");
        bishop.initialize(this.board, this.currentPosition);
        moves.addAll(bishop.getPossibleMoves());

        Piece rook = PieceFactory.getInstance("Rook");
        rook.initialize(this.board, this.currentPosition);
        moves.addAll(rook.getPossibleMoves());
        return moves;
    }
}
