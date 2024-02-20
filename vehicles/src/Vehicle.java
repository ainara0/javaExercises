public class Vehicle {
    static private int createdVehicles = 0;
    static private int totalKilometers = 0;
    protected int travelledKilometers;
    static public int getCreatedVehicles() {
        return createdVehicles;
    }
    static public int getTotalKilometers() {
        return totalKilometers;
    }

    protected static void createAVehicle() {
        createdVehicles += 1;
    }

    protected static void increaseTotalKilometers(int kilometers) {
        totalKilometers += kilometers;
    }
    public int getTravelledKilometers() {
        return this.travelledKilometers;
    }
}
