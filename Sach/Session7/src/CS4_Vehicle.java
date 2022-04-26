package session7;
class CS4_Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;
    public CS4_Vehicle(String vID, String vName, int numWheels){
        vehicleNo = vID;
        vehicleName = vName;
        wheels = numWheels;
    }
    public void accelerate(int speed){
        System.out.println("Accelerating at: "+ speed + " kmph");
    }
}
