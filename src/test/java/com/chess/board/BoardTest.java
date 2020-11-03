package com.chess.board;

import com.chess.board.squares.Square;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    private static List<String> expectedBoardContent;

    @BeforeClass
    public static void beforeClass() throws Exception {
        expectedBoardContent = Arrays.asList("Location{file=A, rank=1}", "Location{file=B, rank=1}", "Location{file=C, rank=1}", "Location{file=D, rank=1}", "Location{file=E, rank=1}", "Location{file=F, rank=1}", "Location{file=G, rank=1}", "Location{file=H, rank=1}",
                "Location{file=A, rank=2}", "Location{file=B, rank=2}", "Location{file=C, rank=2}", "Location{file=D, rank=2}", "Location{file=E, rank=2}", "Location{file=F, rank=2}", "Location{file=G, rank=2}", "Location{file=H, rank=2}",
                "Location{file=A, rank=3}", "Location{file=B, rank=3}", "Location{file=C, rank=3}", "Location{file=D, rank=3}", "Location{file=E, rank=3}", "Location{file=F, rank=3}", "Location{file=G, rank=3}", "Location{file=H, rank=3}",
                "Location{file=A, rank=4}", "Location{file=B, rank=4}", "Location{file=C, rank=4}", "Location{file=D, rank=4}", "Location{file=E, rank=4}", "Location{file=F, rank=4}", "Location{file=G, rank=4}", "Location{file=H, rank=4}",
                "Location{file=A, rank=5}", "Location{file=B, rank=5}", "Location{file=C, rank=5}", "Location{file=D, rank=5}", "Location{file=E, rank=5}", "Location{file=F, rank=5}", "Location{file=G, rank=5}", "Location{file=H, rank=5}",
                "Location{file=A, rank=6}", "Location{file=B, rank=6}", "Location{file=C, rank=6}", "Location{file=D, rank=6}", "Location{file=E, rank=6}", "Location{file=F, rank=6}", "Location{file=G, rank=6}", "Location{file=H, rank=6}",
                "Location{file=A, rank=7}", "Location{file=B, rank=7}", "Location{file=C, rank=7}", "Location{file=D, rank=7}", "Location{file=E, rank=7}", "Location{file=F, rank=7}", "Location{file=G, rank=7}", "Location{file=H, rank=7}",
                "Location{file=A, rank=8}", "Location{file=B, rank=8}", "Location{file=C, rank=8}", "Location{file=D, rank=8}", "Location{file=E, rank=8}", "Location{file=F, rank=8}", "Location{file=G, rank=8}", "Location{file=H, rank=8}");
    }

    @Test
    public void testBoard() {
        Board board = new Board();
        Integer boardContentIndex = 0;
        for (Square squares[] : board.getBoardSquares()) {
            for (Square square : squares) {
                assertThat("Test Board Content :", square.getLocation().toString(),
                        is(equalToIgnoringCase(expectedBoardContent.get(boardContentIndex++))));
            }
        }

    }
}
