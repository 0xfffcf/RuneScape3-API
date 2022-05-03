package sofia.api.runescape;

import kraken.plugin.api.*;
import sofia.api.runescape.helpers.SWorldHopperHelper;

/**
 * Provides utilities for World Hopping.
 *
 * @author Sofia
 * @version 1.0.0
 * @since 1.0.1
 */
public class SWorldHopper {
    /**
     * Make the player hop world to a specific one.
     *
     * @param world The world's id.
     * @return True if it hopped properly.
     */
    public static boolean hopWorld(int world) {
        boolean worked = false;
        Kraken.setLoginWorld(world);

        if (SWorldHopperHelper.openMenu()) {
            worked = SWorldHopperHelper.switchWorld(world);
        }
        return worked;
    }

    /**
     * Hop to a random world based if you are f2p or p2p.
     *
     * @param isMember Is the local player a member.
     * @return True if it hopped properly.
     */
    public static boolean hopRandomWorld(boolean isMember) {
        boolean worked = false;
        int world;

        if (SWorldHopperHelper.openMenu()) {
            if (isMember) {
                world = SWorlds.getRandomWorldP2P();
            } else {
                world = SWorlds.getRandomWorldF2P();
            }
            worked = SWorldHopperHelper.switchWorld(world);
        }
        return worked;
    }
}
