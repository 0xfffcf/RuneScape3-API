package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Maple Tree.
 *
 * @author sofia
 * @version 1.0.0
 * @since 1.0.0
 */
public class MapleTree extends Tree {
    /**
     * Create a new Maple Tree.
     */
    public MapleTree() {
        super(
                new Area3di(new Vector3i(2735, 3495, 0), new Vector3i(2719, 3504, 0)),
                new Area3di(new Vector3i(2797, 3442, 0), new Vector3i(2795, 3437, 0)),
                new Integer[]{
                        51843
                }
        );
    }
}
