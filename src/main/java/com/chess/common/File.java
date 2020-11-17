package com.chess.common;

import com.chess.validator.InvalidInputException;

public enum File {
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7);

    private final int value;

    private File(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public static File fromCode(String code) {
        switch (code) {
            case "A":
                return A;
            case "B":
                return B;
            case "C":
                return C;
            case "D":
                return D;
            case "E":
                return E;
            case "F":
                return F;
            case "G":
                return G;
            case "H":
                return H;
            default:
                throw new InvalidInputException(code);
        }
    }
}
