package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        Square s1 = new BasicSquare();
        unit.occupy(s1);
        assertThat(unit.getSquare()).isEqualTo(s1);
        assertThat(s1.getOccupants().contains(unit));
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        Square s1 = new BasicSquare();
        unit.occupy(s1);
        unit.occupy(s1);
        assertThat(unit.getSquare()).isEqualTo(s1);
        assertThat(s1.getOccupants().contains(unit));
    }
}
