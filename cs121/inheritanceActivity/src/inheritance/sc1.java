package inheritance;

public class sc1 extends superclass {
    public String dType; //dType is what wheel driving. so 4WD would be entered as an example.
    public String battery;
    public String lighting;
    public String pTrain; //powertrain
    public String dTrain; //drivetrain

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setdType(String dType) {
        this.dType = dType;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public void setpTrain(String pTrain) {
        this.pTrain = pTrain;
    }

    public void setdTrain(String dTrain) {
        this.dTrain = dTrain;
    }

    public String getBattery() {
        return battery;
    }

    public String getdType() {
        return dType;
    }

    public String getLighting() {
        return lighting;
    }

    public String getdTrain() {
        return dTrain;
    }

    public String getPTrain() {
        return pTrain;
    }

    public String toString() {
        System.out.println("Battery: " + battery);
        System.out.println("Drivetype: " + dType);
        System.out.println("Lighting: " + lighting);
        System.out.println("Drivetrain: " + dTrain)
        System.out.println("Powertrain: " + pTrain);
    }
}




