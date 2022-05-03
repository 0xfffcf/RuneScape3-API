package sofia.api.runescape;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Provides utilities for Worlds. <br/>
 * NO VIP, NO SKILL REQUIRE, NO ROLE PLAY, NO EOC/LEGACY ONLY
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.1
 */
public class SWorlds {
    protected final static Set<Integer> F2P_WORLD = new HashSet<>();
    private static final Integer[] F2P_WORLDS = {
            3, 7, 8, 11, 17, 19, 20, 29, 34, 38, 43, 61, 80, 81,
            108, 141, 210, 215, 225, 236, 239, 245, 249, 250, 255, 256
    };
    protected final static Set<Integer> P2P_WORLD = new HashSet<>();
    private static final Integer[] P2P_WORLDS = {
            1, 2, 4, 5, 6, 9, 10, 12, 14, 15, 16, 21, 22, 23, 24, 25, 26, 27, 28, 31,
            32, 35, 36, 37, 39, 40, 44, 45, 46, 49, 50, 51, 53, 54, 56, 58, 59, 60,
            62, 63, 64, 65, 67, 68, 69, 70, 71, 72, 73, 74, 76, 77, 78, 79, 82, 83, 84, 85,
            87, 88, 89, 91, 92, 96, 97, 98, 99, 100, 103, 104, 105, 106, 116, 117, 119, 123,
            124, 134, 138, 139, 140, 252, 257, 258, 259
    };
    protected final static Set<Integer> WORLD = new HashSet<>();

    /**
     * Worlds constructor. <br/>
     * Add all the world to their Set.
     */
    public SWorlds() {
        Collections.addAll(F2P_WORLD, F2P_WORLDS);
        Collections.addAll(P2P_WORLD, P2P_WORLDS);

        Collections.addAll(WORLD, F2P_WORLDS);
        Collections.addAll(WORLD, P2P_WORLDS);
    }

    /**
     * @return A set of all the worlds.
     */
    public static Set<Integer> all() {
        return WORLD;
    }

    /**
     * @return A set of f2p Worlds.
     */
    public static Set<Integer> f2p() {
        return F2P_WORLD;
    }

    /**
     * @return A set of p2p Worlds.
     */
    public static Set<Integer> p2p() {
        return P2P_WORLD;
    }

    /**
     * @return A random world from all the worlds.
     */
    public static int getRandomWorld() {
        return SCalculations.random(WORLD.size());
    }

    /**
     * @return A random world from all the f2p worlds.
     */
    public static int getRandomWorldF2P() {
        return SCalculations.random(F2P_WORLD.size());
    }

    /**
     * @return A random world from all the p2p the worlds.
     */
    public static int getRandomWorldP2P() {
        return SCalculations.random(P2P_WORLD.size());
    }
}
