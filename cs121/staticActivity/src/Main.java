import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console=new Scanner(System.in);
        System.out.println("What is your location? ");
        String loc= console.nextLine();
        System.out.println("What is your name? ");
        String ne=console.nextLine();
        staticClass.staticClass(loc,ne);
        staticClass.staticClass("California","James");
        staticClass.staticClass("Maine","Stephenson");


    }
}