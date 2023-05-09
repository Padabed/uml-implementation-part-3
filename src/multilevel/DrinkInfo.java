package multilevel;

public class DrinkInfo {

    public static void main(String[] args) {

        Drink water = new Water(100, 50.0, 3.6, DrinkType.Water);
        Drink beer = new Beer(100, 50.0, 3.6, DrinkType.Alcoholic);
        Drink coke = new Coke(100, 50.0, 3.6, DrinkType.SweetCarbonated);

        try {
            beer.getSugarAmount();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            coke.getStrength();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            water.getStrength();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            water.getSugarAmount();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
