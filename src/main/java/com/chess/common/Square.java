package com.chess.common;

import java.util.Objects;

public class Square {
    private final File file;
    private final Integer rank;

    public Square(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    public File getFile() {
        return file;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return file == square.file &&
                Objects.equals(rank, square.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }

    @Override
    public String toString() {
        return file.toString() + rank;
    }
}
