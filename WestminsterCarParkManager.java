import java.util.ArrayList;
import java.util.List;
public class WestminsterCarParkManager implements CarParkManager{

    private static int maxParkingSlots = 20;
    private static int availableParkingSlots = 0;
    List<Vehicle> parkingList = new ArrayList<Vehicle>();

    public int getAvailableParkingSlots() {
        return availableParkingSlots;
    }

    public void setAvailableParkingSlots(int availableParkingSlots) {
        this.availableParkingSlots = availableParkingSlots;
    }

    private int getConsumeSlots(Vehicle vehicle){
        int consumeSlots;
        if(vehicle instanceof Van) {
            consumeSlots = 2;
        }else{
            consumeSlots = 1;

        }
        return consumeSlots;
    }

    public void addNewVehicle(Vehicle vehicle) {
        int consumeSlots = this.getConsumeSlots(vehicle);
        if( (maxParkingSlots - availableParkingSlots) >= consumeSlots){
            this.setAvailableParkingSlots(availableParkingSlots+consumeSlots);
            parkingList.add(vehicle);
            System.out.println("There are" +(maxParkingSlots - availableParkingSlots));
        }else{
            System.out.println("there are no lots available");
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        parkingList.remove(vehicle);
        for(Vehicle v : parkingList){
            if(v.getIdPlate() == vehicle.getIdPlate()){
                parkingList.remove(v);
            }
        }
        int consumeSlots = this.getConsumeSlots(vehicle);
        this.setAvailableParkingSlots(availableParkingSlots-consumeSlots);
        System.out.println(vehicle.getClass());

    }
    public void  parkedVehicles(){
        for(Vehicle v : parkingList){
            System.out.println(v.getIdPlate()+" "+ v.getBrand());

        }
    }

}
