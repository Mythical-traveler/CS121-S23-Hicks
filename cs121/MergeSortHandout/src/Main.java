import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 4, 11, 9, 8, 1};
        System.out.println("Unsorted Array: " + Arrays.toString(numbers));
        MergeSortHandout z = new MergeSortHandout();
        z.sort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
