package com.chess.board;

import com.chess.board.squares.File;
import com.chess.board.squares.Location;
import com.chess.board.squares.Square;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Board {
    private Square[][] boardSquares = new Square[File.values().length][8];

    public Board() {
        IntStream.range(0, 8).forEach(this::fillRows);
    }

    private void fillRows(Integer row) {
        Arrays.stream(File.values()).forEach(file -> {
            boardSquares[row][file.ordinal()] = new Square(new Location(file, row + 1));
        });
    }

    public Square[][] getBoardSquares() {
        return boardSquares;
    }
}
