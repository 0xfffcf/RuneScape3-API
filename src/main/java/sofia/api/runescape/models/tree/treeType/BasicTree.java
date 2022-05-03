package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Basic Tree.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 * @see Tree
 */
public class BasicTree extends Tree {
    /**
     * Create a new Basic Tree.
     */
    public BasicTree() {
        super(
                new Area3di(new Vector3i(3151, 3447, 0), new Vector3i(3128, 3407, 0)),
                new Area3di(new Vector3i(3182, 3446, 0), new Vector3i(3189, 3435, 0)),
                new Integer[]{
                        38782,
                        38783,
                        38785,
                        38786,
                        38787,
                        38788,
                        38760
                }
        );
    }
}
