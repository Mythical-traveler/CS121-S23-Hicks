import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
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
        System.out.println("Unsorted Array: "+Arrays.toString(numbers));
        return numbers;
    }

    public void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(array));
    }
}


