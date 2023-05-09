package dynamic;

import java.util.HashSet;
import java.util.Set;

public class SuperVehicle {

    private String name;
    private int maxSpeed;

    private static Set<SuperVehicle> extent = new HashSet<>();

    public SuperVehicle(String name, int maxSpeed) {
        setName(name);
        setMaxSpeed(maxSpeed);
        extent.add(this);
    }

    public SuperVehicle(SuperVehicle changeMode, int maxSpeed) {
        extent.remove(changeMode);
        setName(changeMode.getName());
        setMaxSpeed(maxSpeed);
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 300) {
            throw new IllegalArgumentException("Super vehicle cannot be so slow");
        }
        this.maxSpeed = maxSpeed;
    }
}
