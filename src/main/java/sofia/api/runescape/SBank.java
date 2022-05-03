package sofia.api.runescape;

import kraken.plugin.api.*;

/**
 * Provides access to the local player's bank.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class SBank {
    /**
     * Handle the bank and deposit the whole inventory.
     */
    public static void depositInventoryToBank() {
        SceneObject bank = SceneObjects.closest(object -> object.getName().equals("Bank booth"));

        if (bank != null) {
            if (bank.interact("Bank")) {
                Time.waitFor(800);
                if (Bank.isOpen()) {
                    Input.key('c');
                    Time.waitUntil(Inventory::isEmpty);
                }
            }
        }
    }
}
