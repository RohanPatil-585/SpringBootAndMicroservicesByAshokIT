package dependency_injection;

public class App {
    public static void main(String[] args) {

        // Constructor injection
        Car petrolCar = new Car(new PetrolEngine());
        petrolCar.drive();
        System.out.println();
        Car dieselCar = new Car(new DieselEngine());
        dieselCar.drive();

        System.out.println("============================");

        // setter injection
        Car car = new Car();
        car.setEngineInterface(new PetrolEngine());
        car.drive();
        System.out.println();
        car.setEngineInterface(new DieselEngine());
        car.drive();


    }
}
