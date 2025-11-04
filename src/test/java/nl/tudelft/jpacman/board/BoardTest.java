package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test cases for the Board class.
 */
public class BoardTest {

    /**
     * This is a testcase for testBoard.
     */
    @Test
    void testBoard() {
        Square s1 = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = s1;
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }

    /**
     * This is a testcase for testBoardOneNullSquare.
     */
    @Test
    void testBoardOneNullSquare() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        try {
            Board board = new Board(grid);
            board.squareAt(0, 0);
        } catch (AssertionError e) {
            assertThat(e).hasMessageContaining("Initial grid cannot contain null squares");
        }
    }
}
