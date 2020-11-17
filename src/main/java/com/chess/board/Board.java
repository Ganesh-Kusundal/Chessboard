package com.chess.board;

import com.chess.common.File;
import com.chess.common.Square;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Board {
    public static final Integer BOARD_LENGTH = 8;
    private Square[][] boardSquares = new Square[BOARD_LENGTH][BOARD_LENGTH];

    public Board() {
        IntStream.range(0, BOARD_LENGTH).forEach(this::fillRows);
    }

    private void fillRows(Integer rowNumber) {
        Arrays.stream(File.values()).forEach(file -> {
            boardSquares[rowNumber][file.ordinal()] = new Square(file, BOARD_LENGTH - rowNumber);
        });
    }

    public Square[][] getBoard() {
        return boardSquares;
    }

    public Square getSquare(int i, int j) {
        return boardSquares[i][j];
    }

    public String getSquareLocation(int i, int j) {
        return boardSquares[i][j].toString();
    }
}
