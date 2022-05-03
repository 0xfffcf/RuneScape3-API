package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new DeadTree.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @see Tree
 * @since 1.0.0
 */
public class DeadTree extends Tree {
    /**
     * Dead Tree constructor. <br/>
     */
    public DeadTree() {
        super(
                new Area3di(new Vector3i(3124, 3392, 0), new Vector3i(3150, 3466, 0)),
                new Area3di(new Vector3i(3182, 3446, 0), new Vector3i(3189, 3435, 0)),
                new Integer[]{1282, 1289}
        );
    }
}
