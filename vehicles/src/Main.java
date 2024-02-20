public class Main {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.useCar(50);

        Car toyota2 = new Car();
        toyota2.useCar(100);

        System.out.println(toyota.getTravelledKilometers());
        System.out.println(toyota2.getTravelledKilometers());

        Bicycle red = new Bicycle();
        red.useBicycle(200);

        System.out.println(red.getTravelledKilometers());

        System.out.println(Vehicle.getCreatedVehicles());
        System.out.println(Vehicle.getTotalKilometers());

        red.horse(4);

        Menu.mainMenu();
    }
}