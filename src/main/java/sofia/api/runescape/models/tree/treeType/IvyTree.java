package sofia.api.runescape.models.tree.treeType;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.Vector3i;
import sofia.api.runescape.models.tree.Tree;

/**
 * Create a new Ivy Tree.
 *
 * @author sofia
 * @version 1.0.0
 * @since 1.0.0
 */
public class IvyTree extends Tree {
    /**
     * Create a new Ivy Tree.
     */
    public IvyTree() {
        super(
                new Area3di(new Vector3i(3233, 3455, 0), new Vector3i(3231, 3463, 0)),
                new Area3di(new Vector3i(3177, 3499, 0), new Vector3i(3152, 3484, 0)),
                new Integer[]{
                        46320,
                        46322,
                        46324
                }
        );
    }
}
