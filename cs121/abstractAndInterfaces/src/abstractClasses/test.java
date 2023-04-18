package abstractClasses;

import java.util.Scanner;

public class test {
    public static void main (String [] args)
    {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter Weather type: ");
        String wType=console.nextLine();
        System.out.println("Enter Wind Speed: ");
        int speed= Integer.parseInt(console.nextLine());
        Tornado storm=new Tornado(speed,5);
        storm.tClassification(speed);
        System.out.println("Enter Hurricane Max wind: ");
        int maxw=console.nextInt();
        System.out.println("Enter Hurricane Millibars: ");
        int lowmb= console.nextInt();
        sc2 albany=new sc2(maxw,5,lowmb);
        albany.tClassification(maxw);
        storm.toString();
        albany.toString();




    }
}
