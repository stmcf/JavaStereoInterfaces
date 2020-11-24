public class Radio {

    private String make;
    private String model;
    private String station;

    public Radio(String make, String model, String station){
        this.make = make;
        this.model = model;
        this.station = "";

    }

    public String getStation(){
        return this.station;
    }
    public void setStation(String newStation){
        this.station = newStation;
    }

}
