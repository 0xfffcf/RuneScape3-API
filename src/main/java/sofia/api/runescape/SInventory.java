package sofia.api.runescape;

import kraken.plugin.api.*;

import static kraken.plugin.api.Actions.MENU_EXECUTE_WIDGET;

/**
 * Provides access to the local player's inventory.
 *
 * @author Sofia
 * @version 1.0.0
 * @since 1.0.0
 */
public class SInventory {
    /**
     * Drop all the items from the current inventory. <br/>
     * If there is a dialogue the item won't be dropped. </br>
     * This method is faster than the one with dialogue!
     */
    public static void dropInventoryNoDialogue() {
        Inventory.forEach(widgetItem -> {
            Actions.menu(MENU_EXECUTE_WIDGET, 8, widgetItem.getSlot(), 96534535, 1);
        });
    }

    /**
     * Drop all the items from the current inventory. <br/>
     * If there is a dialogue the item will be dropped. </br>
     * This method is slower than the one without dialogue!
     */
    public static void dropInventoryWithDialogue() {
        Inventory.forEach(widgetItem -> {
            Actions.menu(MENU_EXECUTE_WIDGET, 8, widgetItem.getSlot(), 96534535, 1);
            Time.waitFor(700);
            SDialogue.yesOption();
        });
    }

    /**
     * Drop all the item from the inventory. <br/>
     * It is handling items with dialogue, etc.
     */
    public static void dropInventory() {
        if (sameItem()) {
            dropInventoryNoDialogue();
        } else {
            dropInventoryWithDialogue();
        }
    }

    /**
     * Verify if all the items in the inventory are the same.
     *
     * @return True if it is all the same.
     */
    public static boolean sameItem() {
        WidgetItem item = Inventory.first(widgetItem -> widgetItem.getSlot() == 0);

        return Inventory.count(widgetItem -> widgetItem.getWidgetId() == item.getWidgetId()) == 28;
    }
}
