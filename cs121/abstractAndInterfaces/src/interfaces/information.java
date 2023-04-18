package interfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class information implements view
{

    public String RC; //RC=Ram Count


    public void viewer() {
        System.out.println("Test");
    }

    public int info()
    {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter RAM Count: ");
        int RC=console.nextInt();
        System.out.println("RC divided by two: "+(RC/2));
        return RC;
    }

}
