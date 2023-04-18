import java.util.ArrayList;
import java.util.Scanner;

public class BSTester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BSDemo obj = new BSDemo();
        ArrayList<Integer> array = new ArrayList<Integer>();

        System.out.println("Enter total amount of numbers to add: ");
        int count = console.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Number: ");
            array.add(console.nextInt());
        }

        int z = array.size();

        System.out.println("Enter element to search for: ");
        int x = console.nextInt();

        System.out.println("Elements of Arraylist: " + array);
        int result = obj.binarySearch(array, 0, z - 1, x);

        if (result == -1) {
            System.out.println("Element not present in the arraylist!");
        } else {
            System.out.println("Element " + x + " is found at index " + result);
        }
    }
}
