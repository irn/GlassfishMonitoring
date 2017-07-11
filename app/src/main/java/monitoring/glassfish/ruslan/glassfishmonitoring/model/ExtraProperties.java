package monitoring.glassfish.ruslan.glassfishmonitoring.model;

import java.util.Map;

/**
 * Created by ruslan on 11.07.17.
 */

public class ExtraProperties {


    private Map<String, Unit> entities;

    private Map<String, String> childResources;

    public Map<String, Unit> getEntities() {
        return entities;
    }

    public void setEntities(Map<String, Unit> entities) {
        this.entities = entities;
    }

    public Map<String, String> getChildResources() {
        return childResources;
    }

    public void setChildResources(Map<String, String> childResources) {
        this.childResources = childResources;
    }
}
