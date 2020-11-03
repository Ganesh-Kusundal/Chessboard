package com.chess.board.squares;

public class Square {
    private final Location location;

    public Square(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Square{" +
                "location=" + location +
                '}';
    }
}
