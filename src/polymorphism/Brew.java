package polymorphism;

public class Brew {

    public static void main(String[] args) {
        Tea tea = new BaggedGreenTea(100, "MOYA", 10, 10.0);

        System.out.println(tea);
    }
}
