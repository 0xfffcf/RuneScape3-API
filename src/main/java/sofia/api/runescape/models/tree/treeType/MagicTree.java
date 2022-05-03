package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Magic Tree.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class MagicTree extends Tree {
    /**
     * Create a new Tree.
     */
    public MagicTree() {
        super(
                new Area3di(new Vector3i(2698, 3401, 0), new Vector3i(2704, 3394, 0)),
                new Area3di(new Vector3i(2729, 3490, 0), new Vector3i(2721, 3493, 0)),
                new Integer[]{
                        63176
                }
        );
    }
}
