
public abstract class  Vehicle {

    private String idPlate,brand,entryTimeDate,color;
    private  int numberOfDoors;

    public String getIdPlate() {
        return idPlate;
    }

    public void setIdPlate(String idPlate) {
        this.idPlate = idPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEntryTimeDate() {
        return entryTimeDate;
    }

    public void setEntryTimeDate(String entryTimeDate) {
        this.entryTimeDate = entryTimeDate;
    }

    public  int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public void setColor(String color){
        this.color = color;
    }

}
