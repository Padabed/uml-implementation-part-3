package multilevel;

public class Drink {

    private double volume;
    private Double sugarAmount;
    private Double strength;

    private DrinkType drinkType;

    public Drink(double volume, Double sugarAmount, Double strength, DrinkType drinkType) {
        setVolume(volume);
        setDrinkType(drinkType);

        if (drinkType.equals(DrinkType.SweetCarbonated)) {
            setSugarAmount(sugarAmount);
        }

        if (drinkType.equals(DrinkType.Alcoholic)) {
            setStrength(strength);
        }

        if (drinkType.equals(DrinkType.Water)) {
            setDrinkType(drinkType);
        }

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume cannot be less or equals to zero");
        }
        this.volume = volume;
    }

    public Double getSugarAmount() throws IllegalAccessException {
        if (this.drinkType.equals(DrinkType.Alcoholic)
                || this.drinkType.equals(DrinkType.Water)) {
            throw new IllegalAccessException("This drink type does not provide you info about sugar");
        }
        return sugarAmount;
    }

    public void setSugarAmount(Double sugarAmount) {
        if (this.drinkType.equals(DrinkType.Alcoholic)
                || this.drinkType.equals(DrinkType.Water)) {
            throw new IllegalArgumentException("Sugar amount cannot be set properly");
        }
        if (sugarAmount == null || sugarAmount <= 0) {
            throw new IllegalArgumentException("This value cannot be provided or not required");
        }
        this.sugarAmount = sugarAmount;
    }

    public Double getStrength() throws IllegalAccessException {
        if (this.drinkType.equals(DrinkType.SweetCarbonated)
                || this.drinkType.equals(DrinkType.Water)) {
            throw new IllegalAccessException("This drink does not contain any alcohol");
        }
        return strength;
    }

    public void setStrength(Double strength) {
        if (strength == null) {
            throw new IllegalArgumentException("Null value cannot be set");
        }
        if (this.drinkType.equals(DrinkType.SweetCarbonated)
                || this.drinkType.equals(DrinkType.Water)) {
            throw new IllegalArgumentException("This drink cannot contain alcohol");
        }
        if (strength < 3.6 || strength > 99) {
            throw new IllegalArgumentException("Not related to alcoholic drink strength");
        }
        this.strength = strength;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    private void setDrinkType(DrinkType drinkType) {
        if (drinkType == null) {
            throw new IllegalArgumentException("Drink type should be provided");
        }
        this.drinkType = drinkType;
    }
}
