public class Car extends Vehicle {
    public void useCar(int km) {
        this.travelledKilometers += km;
        increaseTotalKilometers(km);
    }
    public Car() {
        this.travelledKilometers = 0;
        createAVehicle();
    }
}