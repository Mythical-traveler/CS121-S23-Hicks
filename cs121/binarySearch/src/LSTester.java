import java.util.Scanner;

public class LSTester {
    public static void main (String [] args){
        Scanner console=new Scanner(System.in);
        int[]array={3,6,2,9,0,13,34,23,10,32,27};
        int d= array.length;
        lSDemo test=new lSDemo();
        System.out.println("enter number: ");
        int key=Integer.parseInt(console.nextLine());
        int found=lSDemo.LinearSearch(key,array);
        if (found==-1)
        {
            System.out.println("Element Not Found!");
        }
        else
        {
            System.out.println("Element was found at Position: "+found);
        }

    }
}
