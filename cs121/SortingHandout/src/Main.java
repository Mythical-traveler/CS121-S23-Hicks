import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] name = {"Wilma", "Rita", "Josh", "Ben", "Cali", "Josiah", "Sofie"};
        System.out.println(Arrays.toString(name));
        int n = name.length;
        Sorting.bubSort(name, n);
        for (int i = 0; i < n; i++) {
            System.out.println("String " + (i + 1) + " is "
                    + name[i]);
        }
        System.out.println(Arrays.toString(name));
        System.exit(0);

    }
}


