package monitoring.glassfish.ruslan.glassfishmonitoring.model;

/**
 * Created by ruslan on 11.07.17.
 */

public class Unit {

    private String unit;

    private long lastsampletime;

    private String name;

    private int count;

    private String description;

    private long starttime;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public long getLastsampletime() {
        return lastsampletime;
    }

    public void setLastsampletime(long lastsampletime) {
        this.lastsampletime = lastsampletime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStarttime() {
        return starttime;
    }

    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }
}
