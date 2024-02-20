import java.util.Scanner;
public class Menu {
    public static void mainMenu() {
        Scanner keyboard = new Scanner(System.in);
        boolean exitMain = false;
        while (!exitMain) {
            System.out.println("VEHICLE MENU");
            System.out.println("-------------------");
            System.out.println("-------------------");
            System.out.println("(0) Exit menu");
            System.out.println("(1) Go to car menu");
            System.out.println("(2) Go to bicycle menu");
            System.out.println("(3) See total travelled distance");
            System.out.println("(4) See number of vehicles");
            switch (keyboard.nextInt()) {
                case 0:
                    exitMain = true;
                    break;
                case 1:
                    carMenu();
                    break;
                case 2:
                    bicycleMenu();
                    break;
                case 3:
                    System.out.println(Vehicle.getTotalKilometers());
                    break;
                case 4:
                    System.out.println(Vehicle.getCreatedVehicles());
                    break;
                default:
                    System.out.println("Please input a valid number.");
            }
        }
    }
    private static void carMenu(){
        System.out.println("car menu reached");
        boolean exitSub = false;
        while (!exitSub) {
            System.out.println("CAR MENU");
            System.out.println("-------------------");
            System.out.println("-------------------");
            System.out.println("(0) Exit menu");
            System.out.println("(1) Create a car");
            System.out.println("(2) Use a car");
            System.out.println("(3) See travelled distance");
            System.out.println("(3) Exit menu");
            System.out.println("(3) Exit menu");
            System.out.println("(3) Exit menu");
            System.out.println("(3) Exit menu");
            System.out.println("(3) Exit menu");

        }
    }
    private static void bicycleMenu(){
        System.out.println("bicycle menu reached");
    }
    // not finished - continue making menu and bicycle methods
}
