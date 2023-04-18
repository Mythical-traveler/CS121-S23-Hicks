import java.util.Scanner;

public class LinearSearchTester {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        int[] array={3,6,2,9,0,13,34,23,10,32,27};
        LinearSearchDemo test= new LinearSearchDemo();
        System.out.println("Enter Number to search for: ");
        int key= Integer.parseInt(console.nextLine());
        int found== test.linearSearch(key,array);
        if (found==-1)
        {
            System.out.println("Number not found!");
        }
        else
        {
            System.out.printf("Item found at index %d, position %d",found,found+1);
        }

    }
}
