package dynamic;

public class SuperPlane extends SuperVehicle {

    private boolean autoPilot = false;

    public SuperPlane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    public SuperPlane(SuperVehicle changeMode, int maxSpeed) {
        super(changeMode, maxSpeed);
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }
}
