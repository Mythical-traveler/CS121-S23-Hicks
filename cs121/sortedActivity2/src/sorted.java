import java.util.Arrays;
import java.util.Scanner;

public class sorted {
    public int[] getArray() {
        Scanner console = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        System.out.println("Enter Number One: ");
        num1 = console.nextInt();
        System.out.println("Enter Number Two: ");
        num2 = console.nextInt();
        System.out.println("Enter Number Three: ");
        num3 = console.nextInt();
        System.out.println("Enter Number Four: ");
        num4 = console.nextInt();
        System.out.println("Enter Number Five: ");
        num5 = console.nextInt();
        int[] numbers = {num1, num2, num3, num4, num5};
        System.out.println("Unsorted Array: "+ Arrays.toString(numbers));
        return numbers;
    }
    public void sortArray(int [] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while ( j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    System.out.println("Sorted Array: "+Arrays.toString(array));

        }
}
