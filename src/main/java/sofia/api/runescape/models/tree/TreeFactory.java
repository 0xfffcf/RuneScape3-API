package sofia.api.runescape.models.tree;

import sofia.api.runescape.models.tree.treeType.*;

/**
 * Tree Factory class.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class TreeFactory {
    /**
     * Factory for the type of tree selected in the menu.
     *
     * @param index The index of the tree selected in the combo box.
     * @return A tree object that correspond to the index.
     */
    public static Tree getTreeType(int index) {
        Tree tree = null;

        switch (index) {
            case 0:
                tree = new DeadTree();
                break;
            case 1:
                tree = new BasicTree();
                break;
            case 2:
                tree = new OakTree();
                break;
            case 3:
                tree = new WillowTree();
                break;
            case 4:
                tree = new MapleTree();
                break;
            case 5:
                tree = new YewTree();
                break;
            case 6:
                tree = new IvyTree();
                break;
            case 7:
                tree = new MagicTree();
                break;
        }
        return tree;
    }
}
