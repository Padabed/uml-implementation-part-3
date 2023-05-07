package polymorphism;

public class LooseOolongTea extends Tea {

    private double weightInMg;

    public LooseOolongTea(double volumeInMilliliters, String producer, double weightInMg) {
        super(volumeInMilliliters, producer);
        setWeightInMg(weightInMg);
    }

    public double getWeightInMg() {
        return weightInMg;
    }

    public void setWeightInMg(double weightInMg) {
        if (weightInMg <= 0) {
            throw new IllegalArgumentException("Weight cannot be less or equals to 0");
        }
        this.weightInMg = weightInMg;
    }

    @Override
    int getCaffeineMg() {
        return (int) (getWeightInMg() * 0.169);
    }

    @Override
    int getBrewedTemp() {
        return getBrewedTeaAmountInMl() < 50 ? 93 : 88;
    }

    @Override
    public String toString() {
        return "LooseOolongTea{" +
                "weightInMg=" + weightInMg +
                "} " + super.toString();
    }
}
