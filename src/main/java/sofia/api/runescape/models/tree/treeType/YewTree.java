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
public class YewTree extends Tree {
    /**
     * Create a new Yew Tree.
     **/
    public YewTree() {
        super(
                new Area3di(new Vector3i(2766, 3436, 0), new Vector3i(2751, 3426, 0)),
                new Area3di(new Vector3i(2729, 3490, 0), new Vector3i(2721, 3493, 0)),
                new Integer[]{
                        38758
                }
        );
    }
}
