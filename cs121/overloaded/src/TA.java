import java.util.Scanner;
public class TA {
    Scanner console = new Scanner(System.in);

    public double gc = 6.673e-11;
    public double mass1,mass2,distance,force,newmass1,newmass2;

    public TA() {
    }

    public TA(double g, double m1, double m2, double r) {
        this.gc = g;
        this.mass1 = m1;
        this.mass2 = m2;
        this.distance = r;
        System.out.println("Enter Mass of Object One: ");
        m1 = console.nextDouble();
        System.out.println("Enter Mass of Object Two: ");
        m2 = console.nextDouble();
        System.out.println("Enter Distance Between Objects: ");
        r = console.nextDouble();
        force = ((gc * m1 * m2) / r*r);



    }

    public double getGc() {
        return gc;
    }

    public double getMass1() {
        return mass1;
    }

    public double getMass2() {
        return mass2;
    }

    public double getDistance() {
        return distance;
    }

    public double getForce() {
        return force;
    }

    public void setMass1(double newmass1) {
        mass1=newmass1;
    }



    public void setMass2(double newmass2) {
       mass2=newmass2;
    }

    public void setDistance(double newdistance) {
        distance=newdistance;
    }

    public double setGc(double gc) {
        return gc;
    }

    public double setForce(double force) {
        this.force = force;
        return force;
    }

    public TA(int n1, int n2, int s) {
        this.mass1 = n1;
        this.mass2 = n2;
        this.distance = s;
        n1= (int) 6e24;
        n2= (int) 2e30;
        s= (int) 1.5e11;
        force = ((gc * n1 * n2) / (Math.pow(s, 2)));
        System.out.println("Gravitational Force: " + force);
    }


    void display() {
        System.out.println("Mass One: " + mass1);
        System.out.println("Mass Two: " + mass2);
        System.out.println("Gravitational Constant: " + gc);
        System.out.println("Distance Between Objects: " + distance);
        System.out.println("Force: " + force);
    }


    public double getNewmass1() {
        return newmass1;
    }

    public void setNewmass1(double newmass1) {
        this.newmass1 = newmass1;
    }
}
