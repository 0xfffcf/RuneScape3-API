package sofia.api.runescape.models.tree;

import kraken.plugin.api.Area3di;
import sofia.api.runescape.SObject;


/**
 * Create a new Tree which has an ID.
 *
 * @author sofia
 * @version 1.0.0
 * @since 1.0.0
 */
public abstract class Tree extends SObject {
    /**
     * Create a new Tree.
     *
     * @param treeArea The area for that type of tree.
     * @param bankArea The bank area for that type of tree
     * @param ids      The id of the tree.
     */
    public Tree(Area3di treeArea, Area3di bankArea, Integer[] ids) {
        super(treeArea, bankArea, ids);
    }
}
