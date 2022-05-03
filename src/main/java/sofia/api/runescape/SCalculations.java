package sofia.api.runescape;

import java.util.Random;

/**
 * Provides utilities for Calculation.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.1
 */
public class SCalculations {
    private static Random rng;

    public SCalculations() {
        rng = new Random();
    }

    /* Class Functions */

    /**
     * Number randomizer 0 to high.
     *
     * @param high The high number exclusive.
     * @return A number between 0 (inclusive) and high (exclusive).
     */
    public static int random(int high) {
        return rng.nextInt(high);
    }

    /**
     * Number randomizer low to high.
     *
     * @param low  The low number inclusive
     * @param high The high number exclusive.
     * @return A number between min (inclusive) and high (exclusive).
     */
    public static int random(int low, int high) {
        return rng.nextInt(high - low) + low;
    }
}
