package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Oak Tree.
 *
 * @author sofia
 * @version 1.0.0
 * @since 1.0.0
 * @see Tree
 */
public class OakTree extends Tree {
    /**
     * Create a new Oak Tree.
     */
    public OakTree() {
        super(
                new Area3di(new Vector3i(3170, 3423, 0), new Vector3i(3159, 3409, 0)),
                new Area3di(new Vector3i(3182, 3446, 0), new Vector3i(3189, 3435, 0)),
                new Integer[]{
                        38731,
                        38732
                });
    }
}
