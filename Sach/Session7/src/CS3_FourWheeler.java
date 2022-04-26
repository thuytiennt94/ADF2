package session7;
class CS3_FourWheeler extends session7.CS1_Vehicle {
    private boolean powerSteer;
    public CS3_FourWheeler(String vID, String vName, int numWheels, boolean pSteer){
        vehicleNo = vID;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Number of Wheels: " + wheels);
        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering : No");
    }
    public void accelerate(int speed){
        System.out.println("Maximumm acceleration: " + speed + " kmph");
    }

    public static void main(String[] args) {
        session7.CS2_FourWheeler objFour = new session7.CS2_FourWheeler("LA-09CS-1406", "Volkswagen", 4, false );
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
