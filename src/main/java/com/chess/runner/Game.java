package com.chess.runner;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import com.chess.piece.Piece;
import com.chess.piece.PieceFactory;

import java.util.List;

public class Game {
    public static void main(String[] args) {
        Piece piece = PieceFactory.getInstance("Knight");
        piece.initialize(new Board(), new Square(File.D, 5));
        List<String> possibleMoves = piece.getPossibleMoves();
        System.out.println(possibleMoves);
    }

}
