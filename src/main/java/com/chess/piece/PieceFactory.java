package com.chess.piece;

import com.chess.validator.InvalidInputException;

public class PieceFactory {
    public static Piece getInstance(String pieceName) {
        switch (pieceName.toUpperCase()) {
            case "KING":
                return new King();
            case "QUEEN":
                return new Queen();
            case "KNIGHT":
                return new Knight();
            case "PAWN":
                return new Pawn();
            case "ROOK":
                return new Rook();
            case "BISHOP":
                return new Bishop();
            default:
                throw new InvalidInputException("Invalid Input : " + pieceName);
        }
    }
}
