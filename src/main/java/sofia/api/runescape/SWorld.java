package sofia.api.runescape;

/**
 * Provides utilities for World.
 *
 * @author Sofia
 * @version 1.0.0
 * @since 1.0.1
 */
public class SWorld {
    /**
     * Verify if the world is F2P only.
     *
     * @param world The world to verify.
     * @return True if it is a F2P only world.
     */
    public static boolean isF2P(int world) {
        return SWorlds.F2P_WORLD.contains(world);
    }

    /**
     * Verify if the world is P2P only.
     *
     * @param world The world to verify.
     * @return True if it is a P2P only world.
     */
    public static boolean isP2P(int world) {
        return SWorlds.P2P_WORLD.contains(world);
    }
}
