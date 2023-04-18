import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int o1,o2,z;
        Scanner console=new Scanner(System.in);
        TA t1 =new TA(6.673e-11,6e24,7.4e22,3.84e8);
        t1.display();
        TA t2 = new TA((int) 6e24, (int)2e30, (int)1.5e11);
        t2.display();
        System.out.println("Enter Mass for Object one: ");
        o1= Integer.parseInt(console.nextLine());
        System.out.println("Enter Mass for Object Two: ");
        o2= Integer.parseInt(console.nextLine());
        System.out.println("Enter Distance between two objects: ");
        z=Integer.parseInt(console.nextLine());
        TA t3= new TA (  o1, o2, z);
        t3.display();
        
       






    }
}