public class Headphones {
    public String manu, type;
    String ct;
    int year;

    public Headphones() {
        manu = "Bose";
        type = "QC 45";
        ct = "Wireless AND Wired";
        year = 2022;

    }

    public Headphones(String manu, int year, String type, String ct) {
        this.manu = manu;
        this.year = year;
        this.type = type;
        this.ct = ct;
    }

    void display() {
        System.out.println("Manufacturer: " + manu);
        System.out.println("Year: " + year);
        System.out.println("Connection: " + ct);
        System.out.println("Model: " + type);
        System.out.println();

    }


}
