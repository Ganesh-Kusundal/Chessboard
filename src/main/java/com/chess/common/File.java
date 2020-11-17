package com.chess.common;

public enum File {
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7);

    private final int value;

    private File(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
