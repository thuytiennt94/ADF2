package session7;
class CS5_FourWheeler extends session7.CS4_Vehicle {
    private boolean powerSteer;
    public CS5_FourWheeler(String vID, String vName, int numWheels, boolean pSteer){
        super(vID, vName, numWheels);
        powerSteer = pSteer;
    }
    public void showDetils(){
        System.out.println("Vehicle no: " + vehicleNo);
        System.out.println("Vehicle name: " + vehicleName);
        System.out.println("Number of Wheels:  " + wheels);
        if (powerSteer == true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(speed);
        System.out.println("Maximum acceleration: " + speed + " kmph");
    }

    public static void main(String[] args) {
        CS5_FourWheeler objFour = new CS5_FourWheeler("LA-09 CS-1406", "Volkswagen", 4, true);
        objFour.showDetils();
        objFour.accelerate(200);
    }
}
/*public class TestVehicle{

}*/
