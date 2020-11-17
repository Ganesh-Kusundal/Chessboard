package com.chess.runner;

import com.chess.board.Board;
import com.chess.common.File;
import com.chess.common.Square;
import com.chess.piece.Piece;
import com.chess.piece.PieceFactory;
import com.chess.validator.Validator;
import org.javatuples.Triplet;

import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.print("Please enter piece with square location (e.g King-D5): ");
        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();

        Validator.validate(input);

        Triplet<String, File, Integer> inputTriplet = getInputMap(input);
        Piece piece = PieceFactory.getInstance(inputTriplet.getValue0());
        piece.initialize(new Board(), new Square(inputTriplet.getValue1(), inputTriplet.getValue2()));

        List<String> possibleMoves = piece.getPossibleMoves();
        System.out.println(possibleMoves);
    }

    private static Triplet<String, File, Integer> getInputMap(String input) {
        return new Triplet<>(input.split("-")[0],
                File.fromCode(input.split("-")[1].split("")[0].toUpperCase()),
                Integer.parseInt(input.split("-")[1].split("")[1]));
    }

}
