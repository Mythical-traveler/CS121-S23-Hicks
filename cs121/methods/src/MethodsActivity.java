import java.util.Scanner;
public class MethodsActivity {

    static Scanner console = new Scanner(System.in);

    public static void main(String[]args) {
        double length,width,area;
        double l=getLength();
        double w=getWidth();
        double a=getArea(l,w);
        displayData(l,w,a);
        console.close();
    }
    public static double getLength() {
        System.out.println("Enter Rectangle Length: ");
        double length = console.nextDouble();
        return length;
    }
    public static double getWidth() {
        System.out.println("Enter Rectangle Width: ");
        double width = console.nextDouble();
        return width;
    }
    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }
    public static void displayData(double length, double width, double area) {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
        System.out.println("Area: " + area);
    }






    }

