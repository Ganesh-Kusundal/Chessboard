package com.chess.validator;

import org.junit.Test;

import java.util.List;

public class ValidatorTest {

    private static List<String> expectedBoardContent;

    @Test
    public void testValidate() {
        Validator.validate("King-D5");
    }

    @Test(expected = InvalidInputException.class)
    public void testValidateForInvalidInput() {
        Validator.validate("KingD5");
    }

    @Test(expected = InvalidInputException.class)
    public void testValidateForInvalidInputAsPieceName() {
        Validator.validate("Kong-D5");
    }

    @Test(expected = InvalidInputException.class)
    public void testValidateForInvalidInputAsSquareLocation() {
        Validator.validate("Queen-O9");
    }
}
