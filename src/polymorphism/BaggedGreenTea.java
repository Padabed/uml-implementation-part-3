package polymorphism;

public class BaggedGreenTea extends Tea {

    private int bagsQuantity;
    private double teaWeightPerOneBagInMg;

    public BaggedGreenTea(double volumeInMilliliters, String producer,
                          int bagsQuantity, double teaWeightPerOneBagInMg) {
        super(volumeInMilliliters, producer);
        setBagsQuantity(bagsQuantity);
        setTeaWeightPerOneBagInMg(teaWeightPerOneBagInMg);
    }

    public int getBagsQuantity() {
        return bagsQuantity;
    }

    public void setBagsQuantity(int bagsQuantity) {
        if (bagsQuantity < 1) {
            throw new IllegalArgumentException("Bags number cannot be less than 1 bag");
        }
        this.bagsQuantity = bagsQuantity;
    }

    public double getTeaWeightPerOneBagInMg() {
        return teaWeightPerOneBagInMg;
    }

    public void setTeaWeightPerOneBagInMg(double teaWeightPerOneBagInMg) {
        if (teaWeightPerOneBagInMg <= 0) {
            throw new IllegalArgumentException("Weight cannot be less or equals to 0");
        }
        this.teaWeightPerOneBagInMg = teaWeightPerOneBagInMg;
    }

    @Override
    int getCaffeineMg() {
        return (int) (getBagsQuantity() * getTeaWeightPerOneBagInMg() * 0.127);
    }

    @Override
    int getBrewedTemp() {
        return getBrewedTeaAmountInMl() < 50 ? 85 : 80;
    }

    @Override
    public String toString() {
        return "BaggedGreenTea{" +
                "bagsQuantity=" + bagsQuantity +
                ", teaWeightPerOneBagInMg=" + teaWeightPerOneBagInMg +
                "} " + super.toString();
    }

}
