package dynamic;

public class Drive {

    public static void main(String[] args) {
        SuperVehicle car = new SuperCar("BaTCar", 400, Nutrition.Fuel);
        SuperVehicle plane = new SuperPlane(car, 400);

        if (car != null) {
            System.out.println("error");
        }

        if (plane instanceof SuperCar) {
            System.out.println("Something went wrong please try again later");
        }

        if (plane instanceof SuperPlane) {
            System.out.println("Mode has been changed");
        }

//        if (car instanceof SuperCar) {
//            System.out.println("Something went wrong please try again later");
//        }
//
//        if (car instanceof SuperPlane) {
//            System.out.println("Mode has been changed");
//        }

     }

}
