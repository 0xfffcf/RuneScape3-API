package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Willow Tree.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class WillowTree extends Tree {

    /**
     * Create a new Willow Tree.
     */
    public WillowTree() {
        super(
                new Area3di(new Vector3i(3091, 3225, 0), new Vector3i(3079, 3240, 0)),
                new Area3di(new Vector3i(3095, 3240, 0), new Vector3i(3092, 3246, 0)),
                new Integer[]{
                        38616,
                        38627,
                        58006
                }
        );
    }
}
