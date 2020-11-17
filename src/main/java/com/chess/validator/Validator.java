package com.chess.validator;

import com.chess.board.Board;
import com.chess.common.File;

import java.util.Arrays;

public class Validator {
    public static void validate(String input) {
        if (input.split("-").length == 2
                && Arrays.asList(Piece.values()).toString().toUpperCase().contains(input.split("-")[0].toUpperCase())
                && new Board().getSquareLocation(File.fromCode(input.split("-")[1].split("")[0].toUpperCase()).getValue(),
                Board.BOARD_LENGTH - Integer.parseInt(input.split("-")[1].split("")[1])).equalsIgnoreCase(input.split("-")[1]))
            return;
        throw new InvalidInputException(input);

    }

    enum Piece {King, Queen, Knight, Rook, Bishop, Pawn}
}

