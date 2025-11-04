package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Test cases for the {@link Direction} enum to verify correct movement deltas.
 */
public class DirectionTest {

    /**
     * Test that moving {@link Direction#NORTH} decreases the Y coordinate by 1.
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }

    /**
     * Test that moving {@link Direction#SOUTH} increases the Y coordinate by 1.
     */
    @Test
    void testSouth() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }

    /**
     * Test that moving {@link Direction#EAST} increases the X coordinate by 1.
     */
    @Test
    void testEast() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }

    /**
     * Test that moving {@link Direction#WEST} decreases the X coordinate by 1.
     */
    @Test
    void testWest() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }
}
