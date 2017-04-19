import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        WestminsterCarParkManager carPark = new WestminsterCarParkManager();
        System.out.println("Welcome to Westmister Car Park");


        while(true){
            Scanner scanner = new Scanner(System.in);
            char c = scanner.findInLine(".").charAt(0);
            switch (c){
                case 'C':
                    Vehicle car = new Car();
                    car = getVehicle(car);
                    carPark.addNewVehicle(car);
                    break;

                case 'V':
                    Vehicle van = new Van();
                    van = getVehicle(van);
                    carPark.addNewVehicle(van);
                    break;

                case 'M':
                    Vehicle bike = new Motorbike();
                    bike = getVehicle(bike);
                    carPark.addNewVehicle(bike);
                    break;

                case 'D':
                   //delete a vehicle here
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }


    }

    public static Vehicle getVehicle(Vehicle vehicle){
        String brand,numPlate, color;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vehicle Brand");
        brand = scanner.nextLine();

        vehicle.setBrand(brand);

        System.out.print("Enter Vehicle Number Plate");
        numPlate = scanner.nextLine();
        vehicle.setIdPlate(numPlate);

        System.out.println("Enter Vehicle Color");
        color = scanner.nextLine();
        vehicle.setColor(color);
        return  vehicle;
    }
}
