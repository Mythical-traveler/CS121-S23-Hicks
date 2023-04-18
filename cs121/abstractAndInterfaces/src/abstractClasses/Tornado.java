package abstractClasses;

import java.util.Scanner;


public class Tornado extends Weather {
    Scanner console = new Scanner(System.in);
    private int wSpeed;

    public Tornado(int wSpeed, int d) {
        super(wSpeed, d);
        tClassification(wSpeed);
    }

    public void tClassification(int wSpeed) {

        if (wSpeed >= 65 && wSpeed <= 85) {
            System.out.println("This is a EF0 Tornado.");
        } else if (wSpeed >= 86 && wSpeed <= 110) {
            System.out.println("This is an EF1 Tornado.");
        } else if (wSpeed >= 111 && wSpeed <= 135) {
            System.out.println("This is an EF2 Tornado.");
        } else if (wSpeed >= 136 && wSpeed <= 165) {
            System.out.println("This is an EF3 Tornado.");
        } else if (wSpeed >= 166 && wSpeed <= 200) {
            System.out.println("This is an EF4 Tornado.");
        } else if (wSpeed >= 200) {
            System.out.println("This is an EF5 Tornado.");
        } else {
            System.out.println("Error!");
        }
    }


    public String toString() {
        System.out.println("Wind Speed: "+wSpeed);
        return null;
    }
}
