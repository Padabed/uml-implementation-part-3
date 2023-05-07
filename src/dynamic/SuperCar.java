package dynamic;

public class SuperCar extends SuperVehicle {

    private Nutrition nutrition;

    public SuperCar(String name, int maxSpeed, Nutrition nutrition) {
        super(name, maxSpeed);
        setNutrition(nutrition);
    }

    public SuperCar(SuperVehicle changeMode, int maxSpeed, Nutrition nutrition) {
        super(changeMode, maxSpeed);
        setNutrition(nutrition);
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }
}
