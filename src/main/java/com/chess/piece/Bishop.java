package com.chess.piece;

import com.chess.board.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Bishop extends Piece {
    @Override
    public List<String> getPossibleMoves() {
        List<String> possibleMoves = new ArrayList<>();

        possibleMoves.addAll(getPossibleMoves((rank, file) -> rank < Board.BOARD_LENGTH && file < Board.BOARD_LENGTH, getOffsets()[0]));
        possibleMoves.addAll(getPossibleMoves((rank, file) -> rank > -1 && file < Board.BOARD_LENGTH, getOffsets()[1]));
        possibleMoves.addAll(getPossibleMoves((rank, file) -> rank > -1 && file > -1, getOffsets()[2]));
        possibleMoves.addAll(getPossibleMoves((rank, file) -> rank < Board.BOARD_LENGTH && file > -1, getOffsets()[3]));

        return possibleMoves;
    }

    public List<String> getPossibleMoves(BiFunction<Integer, Integer, Boolean> biFunction, Integer offset[]) {
        List<String> possibleMoves = new ArrayList<>();
        for (Integer j = Math.abs(getRelativeOffset(currentPosition.getBoardRelativeRank(), offset[0])), i = getRelativeOffset(currentPosition.getFileValue(), offset[1]);
             biFunction.apply(j, i);
             j += offset[0], i += offset[1]) {
            possibleMoves.add(board.getSquareLocation(j, i));
        }
        return possibleMoves;
    }

    private Integer[][] getOffsets() {
        return new Integer[][]{
                {1, 1},
                {-1, 1},
                {-1, -1},
                {1, -1}
        };
    }
}

