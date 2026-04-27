package day07;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("현대", "소나타", 2025, 4);
        Motorcycle motorcycle = new Motorcycle("현대", "소나타", 2022, "크루저");

        System.out.println("-----------");
        car.start();
        car.openTrunk();
        car.stop();
        car.displayInfo();

        System.out.println("\n------------");
        motorcycle.start();
        motorcycle.wheeLie();
        motorcycle.stop();
        motorcycle.displayInfo();
    }
}
