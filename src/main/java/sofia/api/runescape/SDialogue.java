package sofia.api.runescape;

import kraken.plugin.api.*;

import static kraken.plugin.api.Rng.i32;

/**
 * Provides utilities for accessing dialogue widgets.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class SDialogue {
    /**
     * Press on yes when the dialogue is about a yes/no question. <br/>
     * Example: When destroying a WidgetItem. <br/>
     * It verifies if the widget 1183 is open.
     *
     * @see kraken.plugin.api.WidgetItem
     */
    public static void yesOption() {
        if (Widgets.isOpen(1183)) {
            Input.key('Y');
            Time.waitUntil(() -> !Widgets.isOpen(1183), i32(2500, 5000));
        }
    }
}
