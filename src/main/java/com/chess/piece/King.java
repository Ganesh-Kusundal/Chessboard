package com.chess.piece;

import com.chess.board.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class King extends Piece {

    @Override
    public List<String> getPossibleMoves() {
        List<String> moves = new ArrayList<>();
        IntStream.range(0, Board.BOARD_LENGTH)
                .forEach(file -> moves.add(getSquareLocation(getOffsets()[file])));
        return moves;
    }

    public String getSquareLocation(Integer[] offset) {
        return board.getSquareLocation(getRelativeOffset(currentPosition.getBoardRelativeRank(), offset[0]),
                getRelativeOffset(currentPosition.getFileValue(), offset[1]));
    }


    private Integer[][] getOffsets() {
        return new Integer[][]{
                {-1, 0},
                {-1, 1},
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1}
        };
    }
}
