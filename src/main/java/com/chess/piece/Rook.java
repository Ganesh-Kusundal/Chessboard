package com.chess.piece;

import com.chess.board.Board;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

public class Rook extends Piece {

    @Override
    public List<String> getPossibleMoves() {
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.addAll(getAllPossibleMoves(rank -> rank < Board.BOARD_LENGTH, 1));
        possibleMoves.addAll(getAllPossibleMoves(rank -> rank > -1, -1));
        return possibleMoves;
    }

    public List<String> getAllPossibleMoves(IntFunction<Boolean> function, Integer offset) {
        List<String> possibleMoves = new ArrayList<>();
        for (int i = Math.abs(getRelativeOffset(currentPosition.getBoardRelativeRank(), offset)); function.apply(i); i += offset) {
            possibleMoves.add(board.getSquareLocation(Math.abs(currentPosition.getBoardRelativeRank()), i));
        }

        for (int i = getRelativeOffset(currentPosition.getFileValue(), offset); function.apply(i); i += offset) {
            possibleMoves.add(board.getSquareLocation(i, currentPosition.getFileValue()));
        }

        return possibleMoves;
    }
}
