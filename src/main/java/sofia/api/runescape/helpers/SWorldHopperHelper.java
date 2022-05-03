package sofia.api.runescape.helpers;

import kraken.plugin.api.*;

import static kraken.plugin.api.Rng.i32;

/**
 * Provides help for World Hopping.
 *
 * @author Sofia
 * @version 1.0.0
 * @since 1.0.1
 */
public class SWorldHopperHelper {
    /**
     * Open the world hopping menu.
     *
     * @return true if the menu is open.
     */
    public static boolean openMenu() {
        Input.key(0x1B); // ESC Character
        Actions.menu(Actions.MENU_EXECUTE_WIDGET, 1, -1, 93913152, 1701969921); // Hop World Menu

        return Time.waitUntil(() -> Widgets.isOpen(1587), i32(5000, 10000));
    }

    /**
     * Click on a world and till we are in a new one.
     *
     * @param world The world that we will hop on.
     * @return True if we hopped world.
     */
    public static boolean switchWorld(int world) {
        boolean worked = false;

        Actions.menu(Actions.MENU_EXECUTE_WIDGET, 1, world, 104005640, 66537); // Click on the world
        if (Time.waitUntil(() -> Widgets.isOpen(4))) {
            Actions.menu(Actions.MENU_EXECUTE_WIDGET, 1, -1, 104005727, 327681); // Accept
            if (Time.waitUntil(() -> !Client.isLoading(), i32(8000, 10000))) {
                worked = true;
            }
        }
        return worked;
    }
}
