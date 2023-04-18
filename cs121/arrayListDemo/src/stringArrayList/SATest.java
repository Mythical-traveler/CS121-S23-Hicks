package stringArrayList;
import java.util.Scanner;

public class SATest {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        StringArrayList sal = new StringArrayList();
        sal.addBn("AC/DC");
        sal.addSong("TNT");
        sal.addBn("Black Sabbath");
        sal.addSong("The Wizard");
        System.out.println("Enter Desired Band: ");
        sal.addBn(console.nextLine());
        System.out.println("Enter Desired Song: ");
        sal.addSong(console.nextLine());
        System.out.println("Band Array Size: "+sal.getSizeBand());
        System.out.println("Song Array Size: "+sal.getSizeSong());
        sal.getSizeSong();
        sal.DisplayBands();
        sal.DisplaySongs();

    }
}


