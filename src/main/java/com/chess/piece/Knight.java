package com.chess.piece;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Knight extends Piece {

    @Override
    public List<String> getPossibleMoves() {
        return Arrays.stream(getOffsets())
                .filter(this::isValidMove)
                .map(this::getMove)
                .collect(Collectors.toList());
    }

    private String getMove(int[] offset) {
        return board.getSquareLocation(getRelativeOffset(currentPosition.getBoardRelativeRank(), offset[1]),
                getRelativeOffset(currentPosition.getFileValue(), -offset[0]));
    }

    private boolean isValidMove(int[] offset) {
        return getRelativeOffset(currentPosition.getFileValue(), -offset[0]) >= 0
                && getRelativeOffset(currentPosition.getBoardRelativeRank(), offset[1]) >= 0;
    }

    private int[][] getOffsets() {
        return new int[][]{
                {-2, 1},
                {-1, 2},
                {1, 2},
                {2, 1},
                {2, -1},
                {1, -2},
                {-1, -2},
                {-2, -1}
        };
    }
}