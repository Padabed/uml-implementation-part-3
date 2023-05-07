package polymorphism;

abstract class Tea {

    private double brewedTeaAmountInMl;
    private String producer;

    Tea(double brewedTeaAmountInMl, String producer) {
        setBrewedTeaAmountInMl(brewedTeaAmountInMl);
        setProducer(producer);
    }

    abstract int getCaffeineMg();
    abstract int getBrewedTemp();

    void setProducer(String producer) {
        if (producer == null || producer.isBlank()) {
            throw new IllegalArgumentException("Producer name cannot be a null value");
        }
        this.producer = producer;
    }

    String getProducer() {
        return producer;
    }

    double getBrewedTeaAmountInMl() {
        return brewedTeaAmountInMl;
    }

    void setBrewedTeaAmountInMl(double brewedTeaAmountInMl) {
        if (brewedTeaAmountInMl <= 0) {
            throw new IllegalArgumentException("Volume cannot be calculated for less than or equals to 0 ml");
        }
        this.brewedTeaAmountInMl = brewedTeaAmountInMl;
    }

    @Override
    public String toString() {
        return "Tea{" +
                "brewedTeaAmountInMl=" + brewedTeaAmountInMl +
                ", producer='" + producer + '\'' +
                '}';
    }

}
