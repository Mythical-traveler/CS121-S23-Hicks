package inheritance;

public class superclass {
    public String car;
    public String make;
    public int cost;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setCost(String cost) {
        this.cost = Integer.parseInt(cost);
    }

    public int getCost() {
        return cost;
    }

    public String toString() {
        System.out.println("Car: " + car);
        System.out.println("Make: " + make);
        System.out.println("Cost: " + cost);


        return null;
    }
}





