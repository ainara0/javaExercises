public class Bicycle extends Vehicle{
    public void useBicycle(int km) {
        this.travelledKilometers += km;
        increaseTotalKilometers(km);
    }
    public Bicycle(){
        this.travelledKilometers = 0;
        createAVehicle();
    }
    public void horse(int times) {
        for (int i = 0; i < times; i ++) {
            System.out.println("Yeehaw!");
        }
    }
}
