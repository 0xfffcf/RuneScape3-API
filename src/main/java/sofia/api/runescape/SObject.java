package sofia.api.runescape;

import kraken.plugin.api.Area3di;
import kraken.plugin.api.SceneObject;
import kraken.plugin.api.SceneObjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Provides utilities for object around the player.
 *
 * @author 0xfffcf
 * @version 1.0.0
 * @since 1.0.0
 */
public class SObject {
    protected final Integer[] IDs;
    protected final Set<Integer> ID;
    private final Area3di OBJECT_AREA;
    private final Area3di BANK_AREA;

    /**
     * Create a new Object.
     *
     * @param objectArea The area for that type of object.
     * @param bankArea   The bank area for that type of tree
     * @param ids        The id of the object.
     */
    public SObject(Area3di objectArea, Area3di bankArea, Integer[] ids) {
        this.OBJECT_AREA = objectArea;
        this.BANK_AREA = bankArea;
        this.IDs = ids;
        this.ID = new HashSet<>();

        Collections.addAll(ID, IDs);
    }

    /**
     * @return The set of ID for the object.
     */
    public Set<Integer> getID() {
        return ID;
    }

    /**
     * @return The area of the object.
     * @see Area3di
     */
    public Area3di getOBJECT_AREA() {
        return OBJECT_AREA;
    }

    /**
     * @return The area of the bank for this object.
     * @see Area3di
     */
    public Area3di getBANK_AREA() {
        return BANK_AREA;
    }

    /* Class Functions */

    /**
     * Get the closest object that respect the filter.
     * @param pObject An SObject.
     * @return An SceneObject.
     */
    public static SceneObject getObjectRecursively(SObject pObject) {
        SceneObject sceneObject = null;

        for (int i = 0; i < 5; i++) {
            if (sceneObject == null) {
                sceneObject = SceneObjects.closest((object -> {
                    boolean hasSameId = pObject.getID().contains(object.getId());
                    boolean isObjectHidden = object.hidden();

                    return hasSameId && !isObjectHidden;
                }));
            }
        }
        return sceneObject;
    }
}
