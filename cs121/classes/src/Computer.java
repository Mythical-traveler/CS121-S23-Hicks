public class Computer {
    public String model, manufacturer, gb, ram;
    public int year;

    public Computer() {
        model = "XPS 15 9520";
        manufacturer = "Dell";
        gb = "64 GB of Ram";
        year = 2022;
    }

    public Computer(String model, String manufacturer, String gb, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.gb = gb;
        this.year = year;

    }

     void display() {
        System.out.println("Computer Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("This computer has " + gb + " of RAM");
        System.out.println("This Computer is from: " + year);
        System.out.println();

    }



}




