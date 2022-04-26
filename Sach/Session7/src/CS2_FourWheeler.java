package session7;
class CS2_FourWheeler extends session7.CS1_Vehicle {
    private boolean powerSteer;
    public CS2_FourWheeler(String vID, String vName, int numWheels, boolean pSteer){
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

    public static void main(String[] args) {
        CS2_FourWheeler objFour = new CS2_FourWheeler("LA-09CS-1406", "Volkswagen", 4, false );
        objFour.showDetails();
        objFour.accelerate(200);
    }
}
